package org.example.homeworkten2;
//https://www.codewars.com/kata/5aa736a455f906981800360d/train/java
public class Kata {
    public static boolean feast(String beast, String dish) {
        int n = beast.length();
        int m = dish.length();
        if (beast.charAt(0) == dish.charAt(0) &&
            beast.charAt(n-1) == dish.charAt(m-1)){
            return true;
        }
            return false;
    }
}
