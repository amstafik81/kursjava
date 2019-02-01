package _12_zadanie_domowe_01_02_2019;

import java.util.Scanner;

public class Zadanie1_choinka {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Podaj ile poziomów chcesz");
        int wejscie=input.nextInt();
        for (int i = 0; i < wejscie; i++) {
            for (int j = 0; j < wejscie - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }


    }
}
