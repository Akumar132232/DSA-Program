package com.bridglabz;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string1 and string2 to check for anagram: ");

        String string1 = sc.next();	//first string
        String string2 = sc.next(); //second string

        Utility utility = new Utility();

        if(utility.anagram(string1, string2)) {
            System.out.println("Strings are anagram.");
        }
        else {
            System.out.println("Strings are not anagram.");
        }
        sc.close();
    }

}

