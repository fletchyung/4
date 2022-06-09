package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива ");
        int n = scanner.nextInt();
        int array[] = new int[n];
        System.out.print("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        for (int t = 0; t < n; t++) {
            if (min < array[t]) {
                min = array[t];
            }
        }
        float S=0;
        for(int k=0; k<n; k++)
        {
            S=S+array[k];
        }
        System.out.println("Ответ: " + S/n+min);
    }
}