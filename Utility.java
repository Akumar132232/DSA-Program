package com.bridglabz;

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
}
