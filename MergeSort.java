package com.bridglabz;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings::");
        int numberOfStrings = sc.nextInt();

        //strings entered by user

        String[] strings = new String[numberOfStrings];

        //	filling array from user input
        System.out.print("Enter strings to sort::");
        for(int i = 0; i < numberOfStrings; i++) {
            strings[i] = sc.next();
        }
        Utility utility = new Utility();
        strings = utility.mergeSort(strings);

        System.out.println("Sorted list:");
        //prints sorted array
        for(String string : strings) {
            System.out.print("\t"+string);
        }
        sc.close();
    }

}
