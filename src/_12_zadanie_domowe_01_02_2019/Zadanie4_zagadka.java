package _12_zadanie_domowe_01_02_2019;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Zadanie4_zagadka {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner input=new Scanner(System.in);
        int x=r.nextInt(10);
        int y=r.nextInt(10);
        int z=x*y;
        System.out.println("Zganij wynik mnożenia dwóch liczb w zakresie od 1 do 100");
        System.out.println("Podaj twój typ");
        boolean wynik=true;
        while(wynik){


            int zgaduj=input.nextInt();
            if(zgaduj==z){
                wynik=false;
                System.out.println("brawo zgadłeś");
            }
            System.out.println("Nie zgadłeś, podaj jeszcze raz:");

        }
    }
}
