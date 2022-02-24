package com.company;

public class Main {

    public static void main(String[] args) {
//                   0
        int[] arr = {1,2,3,4,5,6,7,8};
//        printArr(arr);
//        printFrom1to100();
//        printFromAtoB(54,256);
//        printFrom10to1();
        int[] arr2 = powerOfArr(arr);
        printArr(arr2);
    }

    static void printArr (int[] arr){
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ", ");
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
