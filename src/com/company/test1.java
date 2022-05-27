package com.company;

public class test1 {
    public static void main(String[] args) {

        int array1[] = new int[5];
        int array2[] = new int[5];
        int array3[] = new int[10];


        for (int i = 0; i < 5; i++) {
            array1[i] = (int) Math.round(Math.random() * 10);
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            array2[i] = (int) Math.round(Math.random() * 10);

            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {

            array1[i] = (int) Math.round(Math.random() * 10);

            System.out.println("Перший елемент: "+array1[i]);

            array2[i] = (int) Math.round(Math.random() * 10);
            System.out.println("Другий елемент: " + array2[i]);
            array3[i] = array2[i] * array1[i];

            System.out.println("добуток: " + array3[i]);

        }
    }
}