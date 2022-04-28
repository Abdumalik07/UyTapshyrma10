package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(contains(50, 89, 75, 56, 12));
    }

    static boolean contains(int a, int... values) {
        for (int value : values) {
            if (a == value) {
                return true;
            }
        }
        return false;
    }
}
