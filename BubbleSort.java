package com.bridglabz;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of integers to sort: ");
        int count = sc.nextInt();

        //array to store integers
        int[] array = new int[count];

        //fills the array asking user input
        System.out.print("Enter integers to sort: ");
        for(int i = 0; i < count; i++) {
            array[i] = sc.nextInt();
        }

        Utility utility = new Utility();

        //sorts the array Using bubble sort
        array = utility.bubbleSortAscending(array);

        //prints the array
        System.out.print("After sort::");
        for(int element : array) {

            System.out.print("\t"+element);
        }
        sc.close();
    }

}
