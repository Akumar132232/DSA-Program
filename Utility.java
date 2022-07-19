package com.bridglabz;

import java.util.Arrays;

public class Utility {
    public void permute(String first, String last) {
        int size = last.length();
        if (size == 0) {
            System.out.println(first);
        } else {
            for (int i = 0; i < size; i++) {
                String myFirst = first + last.charAt(i);
                String myLast = last.substring(0, i) + last.substring(i + 1, size);
                permute(myFirst, myLast);
            }
        }
    }

    public int[] insertionSortDescending(int[] binaryIntArray) {

        for (int i = 1; i < binaryIntArray.length; i++) {
            int key = binaryIntArray[i];
            int j = i - 1;
            while ((j > -1) && (binaryIntArray[j] < key)) {
                binaryIntArray[j + 1] = binaryIntArray[j];
                j--;
            }
            binaryIntArray[j + 1] = key;
        }

        return binaryIntArray;
    }

    public String[] insertionSortDescending(String[] binaryStringArray) {

        for (int i = 1; i < binaryStringArray.length; i++) {
            String key = binaryStringArray[i];
            int j = i - 1;
            while ((j > -1) && (binaryStringArray[j].compareTo(key) < 0)) {
                binaryStringArray[j + 1] = binaryStringArray[j];
                j--;
            }
            binaryStringArray[j + 1] = key;
        }

        return binaryStringArray;
    }

    public String[] insertionSortAscending(String[] binaryStringArray) {

        for (int i = 1; i < binaryStringArray.length; i++) {
            String key = binaryStringArray[i];
            int j = i - 1;
            while ((j > -1) && (binaryStringArray[j].compareTo(key) > 0)) {
                binaryStringArray[j + 1] = binaryStringArray[j];
                j--;
            }
            binaryStringArray[j + 1] = key;
        }

        return binaryStringArray;
    }
    public int[] bubbleSortAscending(int[] binaryIntArray) {

        int n = binaryIntArray.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < (n - 1 - i); j++) {
                if(binaryIntArray[j] > binaryIntArray[j+1]) {
                    int temp = binaryIntArray[j];
                    binaryIntArray[j] = binaryIntArray[j+1];
                    binaryIntArray[j+1] = temp;
                }
            }
        }
        return binaryIntArray;
    }
    public boolean anagram(String string1, String string2) {
        if(string1.length() != string2.length()) {
            return false;
        }
        char[] array1 = string1.toCharArray();
        Arrays.sort(array1);
        char[] array2 = string2.toCharArray();
        Arrays.sort(array2);

        for(int i = 0; i < array1.length; i++) {
            if(array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    public String[] mergeSort(String[] array){
        if(array.length == 1){
            return array;
        }
        String first[] = new String[array.length / 2];
        String last[] = new String[array.length - (array.length / 2)];
        for(int i = 0; i < first.length; i++){
            first[i] = array[i];
        }
        int j = 0;
        for(int i = first.length; i < array.length; i++){
            last[j] = array[i];
            j++;
        }
        first = mergeSort(first);
        last = mergeSort(last);

        String[] returnArray = new String[array.length];
        int firstPos = 0, lastPos = 0;
        for(int i = 0; i < returnArray.length; i++){
            if(lastPos == last.length){
                returnArray[i] = first[firstPos];
                firstPos++;
            }
            else if(firstPos == first.length){
                returnArray[i] = last[lastPos];
                lastPos++;
            }
            else if(first[firstPos].compareTo(last[lastPos]) > 0){
                returnArray[i] = last[lastPos];
                lastPos++;
            }
            else{
                returnArray[i] = first[firstPos];
                firstPos++;
            }
        }
        return returnArray;
    }
}
