package _12_zadanie_domowe_01_02_2019;

import java.util.Random;
import java.util.Scanner;

public class Zadanie5_zgaduj_z_zakresu {
    public static void main(String[] args) {
        Random  r=new Random();
        Scanner input=new Scanner(System.in);
        int liczba=r.nextInt(100);
        System.out.println("Odgadnij wylosowną liczbe");
        boolean wynik=true;

        while (wynik){
            int zg=input.nextInt();
            if(zg>liczba){
                System.out.println("Podałeś za dużą liczbe");
            }
            else if(zg<liczba){
                System.out.println("Podałes za małą liczbe");
            }
            else if(zg==liczba){
                System.out.println("brawo zgadłeś liczbe");
                wynik=false;
            }
        }

    }
}
