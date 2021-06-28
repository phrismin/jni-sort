//package com.example.jnisort;
//
//import com.example.jnisort.model.Data;
//import com.example.jnisort.model.JNISortingUtils;
//import com.example.jnisort.service.ClientService;
//import com.example.jnisort.service.ClientServiceImpl;
//
//import java.util.Arrays;
//
//public class TestRun {
//    public static void main(String[] args) {
//
//        System.load("E:\\home\\dev\\jni-sort\\bin\\lib\\build\\lib.dll");
//
//        int[] array = new int[] {5, 8, 4, 96, 0, 1};
//        JNISortingUtils jniSortingUtils = new JNISortingUtils();
//        ClientService clientService = new ClientServiceImpl();
//        int[] sortArray = clientService.sortArray(array);
//        System.out.println(sortArray);
//        clientService.writeResultInFile(sortArray);
//        System.out.println(Arrays.toString(jniSortingUtils.sortArrayNumber(array)));
//    }
//}