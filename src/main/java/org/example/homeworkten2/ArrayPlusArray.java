package org.example.homeworkten2;

//https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java

public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int result = 0;
        for (int i = 0; i < arr1.length; i++) {
            result += arr1[i] + arr2[i];
        }
        return result;
    }
}