package _7_petle;

import java.util.Scanner;

public class Silnia {
    public static long silnia(int n){
        int wynik=1;
        for(int i=1;i<=n;i++){
            wynik*=i;
        }
        return wynik;
    }

    public static void main(String[] args) {
        Scanner wejscie=new Scanner(System.in);
         while(true){
             System.out.println("Podaj liczbe");
             int liczba=wejscie.nextInt();

             try {
                 long wynik=silnia(liczba);
                 System.out.println("Wynik silni wynosi:"+wynik);
             } catch (Exception e) {
                 e.printStackTrace();
             }


         }
    }
}
