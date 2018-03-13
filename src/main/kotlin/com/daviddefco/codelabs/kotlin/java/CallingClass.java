package com.daviddefco.codelabs.kotlin.java;

public class CallingClass {
    public boolean printIntArray(int[] array) {
        for(int i: array) {
            System.out.println(i);
        }
        return true;
    }

    public void callFromCharArray(char[] charArray) {
        for (char achar: charArray) {
            System.out.println(achar);
        }
    }
}
