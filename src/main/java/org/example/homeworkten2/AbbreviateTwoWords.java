package org.example.homeworkten2;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String[] arr = name.toUpperCase().split(" ");
        return arr[0].charAt(0)+"."+arr[1].charAt(0);
     }
}