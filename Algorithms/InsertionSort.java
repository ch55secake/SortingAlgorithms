package Algorithms;

import java.util.Scanner;

public class InsertionSort {

    public static void main(String args[]) {
        int size, i, j, temp;
        int array[] = new int[6];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size:");
        size = scanner.nextInt();

        for (i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        for(temp=1; temp< array.length-1; temp++) {
            j = array[temp];
            int k = temp-1;
            while(k>=0 && j <= array[k]) {
                array[k+1] = array[k];
                k = k- 1;
            }
            array[k+1] = temp;
        }
        System.out.println("Now the array is sorted.");
        for (i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
