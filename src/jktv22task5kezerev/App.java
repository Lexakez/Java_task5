/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv22task5kezerev;

import java.util.Arrays;
import java.util.Random;


class App {

    void run() {
        int[][] jaggedArray = {
            new int[3],
            new int[5],
            new int[7],
            new int[8],
            new int[9]
        };

        Random random = new Random();


        for (int[] jaggedArray1 : jaggedArray) {
            for (int j = 0; j < jaggedArray1.length; j++) {
                jaggedArray1[j] = random.nextInt(51) + 50;
            }
        }


        System.out.println("Несортированный массив:");
        printJaggedArray(jaggedArray);

        // Сортируем массив
        for (int[] jaggedArray1 : jaggedArray) {
            Arrays.sort(jaggedArray1);
        }


        System.out.println("Отсортированный массив:");
        printJaggedArray(jaggedArray);
    }

    static void printJaggedArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
