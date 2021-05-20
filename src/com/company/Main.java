package com.company;
import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте размер массива: ");
        int n = scan.nextInt();
        int[] masInt = new int[n];
        for (int i=0; i<n; i++){
            System.out.println("Введите значение " + i +" злемента");
            masInt[i]= scan.nextInt();
        }
        System.out.print("Весь массив ");
        for (int i=0; i<n; i++){
             System.out.print(  masInt[i] + ", ");
        }
       
    }
}
