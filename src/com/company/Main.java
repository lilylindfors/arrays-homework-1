package com.company;

public class Main {

    public static void main(String[] args) {
        int[] ELEMENTS = {2, 5, -3, 11, 193, -2};
        int sum = 0;

        for (int value : ELEMENTS) {
            sum = sum + value;
            System.out.println(value);
        }
        System.out.println (sum);

    }
}
