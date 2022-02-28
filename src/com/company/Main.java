package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//                   0 1 2 3 4 5 6 7
        int[] arr = {1,2,3,4,5,6,7,8};// arr.length = 8
        int[][] fix = {
                {1,2,3}, // 0
                {4,5,6}, // 1
                {7,8,9}  // 2
        };

        String[][] ami = {
                {"abc","def","ghi"},
                {"ihg","fed","cba"},
                {"1","2 + 3","3"}
        };

//        for (int i = 0; i < fix.length; i++) {
//            printArray(fix[i]);
//        }

        char[] charArr = {'a','b','c','d'};
//                        i =          0                1             2
        char[][] charArrArr = { {'a','b','c','d'} , {'e','f'} , {'g','h','i'} };
//                        j =     0   1   2   3       0   1       0   1   2
        char char1 = charArrArr[2][1];
//        System.out.println(char1);
//
//        System.out.println(charArrArr[0][2]);

        for (int i = 0; i < charArrArr.length; i++) {
            for (int j = 0; j < charArrArr[i].length; j++) {
                System.out.println(charArrArr[i][j]);
            }
        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println("me");
//            System.out.println("meeee");
//            System.out.println("--------");
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("before j");
//
//            for (int j = 0; j < 3; j++) {
//                System.out.println("---j---");
//            }
//
//            System.out.println("after j");
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print("#");
//        }
//
//        printRectangle(7,4);
//
//
//        for (int i = 0; i < fix.length; i++) {
//            System.out.println(fix[i]);
//        }
//        printArr(arr);
//        printFrom1to100();
//        printFromAtoB(54,256);
//        printFrom10to1();
//        int[] arr2 = powerOfArr(arr);
//        printArr(arr2);
//        printArray(arr);
//
//        for (int i = 1; i <= 100; i++) {
//            if (i <= 50 || i > 51){
//                System.out.print(i + ", ");
//            }else if (i == 51){
//                System.out.println();
//                System.out.print(i + ", ");
//            }
//        }
//
//        System.out.println("Please type a number");
//        int x = scanner.nextInt();
//
//        if (x > 10 && x < 20){
//            System.out.println("between 11 and 19");
//        }else if(x <= 10 || x >= 20){
//            System.out.println("everything else");
//        }
//
//        for (int i = 1; i >= 0 ; i++) {
//            // i >= 0
//            System.out.println(i);
//            // i++
//        }


    }

//    static void printArr (int[] arr){
//        System.out.print("{");
//        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length-1){
//                System.out.print(arr[i]);
//            }else{
//                System.out.print(arr[i] + ", ");
//            }
//        }
//        System.out.print("}");
//    }
    static void printRectangle(int width, int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    static void printArray(int[] arr){
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1){
                System.out.print(arr[i] + ", ");
            }else{
                System.out.print(arr[i]);
            }
        }
        System.out.print("}");
    }

    static void printArrBackwards(int[] arr){
        System.out.print("{");
        for (int i = arr.length-1; i >= 0; i--) {
            if (i == 0){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("}");
    }

    static void printFrom1to100(){
        for (int i = 1; i < 101; i++) {
            System.out.println("i = " + i);
        }
    }

    static void printFrom10to1(){
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    static void printFromAtoB(int a, int b){
        if (a > b){
            System.out.println("a is larger");
        }else{
            for (int i = a; i <= b; i++) {
                //
                System.out.println(i);
            }
        }

    }

    static int[] powerOfArr (int[] arr){
        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i] * arr[i];
            arr[i] *= arr[i];
        }
        return arr;
    }


}
