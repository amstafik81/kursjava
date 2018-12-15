package _2_typy;

import java.util.Scanner;

public class TypyObiektowe {
    public static void main(String[] args) {
        Scanner  wejscie=new Scanner(System.in);
        System.out.print("Podaj swoje imie");
        String imie=wejscie.nextLine().toLowerCase();
        int ileznakow=imie.length();
        String ostatnia=imie.toLowerCase().substring(imie.length()-1);
        boolean czyKonczySieNaA=imie.toLowerCase().endsWith("a");
        System.out.println(imie+" ma "+ileznakow+" znakow");

        if (czyKonczySieNaA) {
            if(imie.equalsIgnoreCase("Kuba")){
                System.out.println("Imie meskie");

            }
            else {
                System.out.println("Imie zenskie");
            }
        }
        else {
            System.out.println("Imie meskie");
        }
        if (czyKonczySieNaA && !imie.equalsIgnoreCase("Kuba")) {

                System.out.println("Imie zenskie");
            }
        else {
            System.out.println("Imie meskie");
        }




    }
}
