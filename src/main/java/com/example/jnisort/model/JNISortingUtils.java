package com.example.jnisort.model;

public class JNISortingUtils {

    static {
        System.load("E:\\home\\dev\\jni-sort\\bin\\lib\\build\\lib.dll");
    }

    public native int[] sortArrayNumber(int[] array);
//    public native void print();
}
