package Algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void main(String args[]) {
        int size, i, j, temp;
        int array[] = new int[50];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size:");
        size = scanner.nextInt();

        for (i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Sorting array......");
        long startTime = System.nanoTime();
        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;
        System.out.println("Now the array is sorted.");
        System.out.println("It took "+elapsedTime+" nano seconds");
        System.out.println("Sorted array"+ Arrays.toString(array));
    }
}