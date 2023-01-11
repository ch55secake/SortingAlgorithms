package Algorithms;

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

        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Now the array is sorted.");
        for (i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }

    }
}