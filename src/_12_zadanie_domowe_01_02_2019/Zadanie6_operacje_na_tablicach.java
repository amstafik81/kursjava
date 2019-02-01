package _12_zadanie_domowe_01_02_2019;

import java.util.Scanner;

public class Zadanie6_operacje_na_tablicach {


    static  int suma(int[] tab){
        int wynik=0;
        for (int i:tab) {
            wynik+=i;

        }
        return wynik;
    }
    static int max(int[] t){
        int maxValue = t[0];
        for(int i=1;i < t.length;i++){
            if(t[i] > maxValue){
                maxValue = t[i];
            }
        }
        return maxValue;
    }
    static double srednia(int[] t){
        int suma=0;

        for (int i:t) {
            suma+=i;
        }
        return (double)suma/t.length;
    }
    static void wypiszWieksze(int[] t,int x){
        for (int i:t) {
            if (i>x){
                System.out.println("Liczba :"+i+"jest wieksza od :"+x);
            }

        }

    }




    public static void main(String[] args) {
        int[] tab={1,2,3,4};
        System.out.println("Wynik sumy elementów  tablicy wynosi:"+suma(tab));
        System.out.println("Najwieksza liczba z tablicy t :"+max(tab));
        System.out.println("średnia z tablicy  t :"+srednia(tab));
        Scanner input =new Scanner(System.in);
        System.out.println("Podaj liczbe która ma byc mniejsza od liczb w tablicy");
        int liczba=input.nextInt();
        wypiszWieksze(tab,liczba);

    }
}
