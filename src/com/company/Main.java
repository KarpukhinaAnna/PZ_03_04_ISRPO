package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите колличество баллов:");
        int b = sc.nextInt();
        sc.close();

        if (b >= 91 && b <= 100)
        {
            System.out.println("Оценка - A");
        }
        else if (b >= 81 && b <= 90)
        {
            System.out.println("Оценка - B");
        }
        else if (b >= 71 && b <= 80)
        {
            System.out.println("Оценка - C");
        }
        else if (b >= 61 && b <= 70)
        {
            System.out.println("Оценка - D");
        }
        else if (b >= 50 && b <= 60)
        {
            System.out.println("Оценка - E");
        }
        else
        {
            System.out.println(" Оценка - F");
        }
    }
}
