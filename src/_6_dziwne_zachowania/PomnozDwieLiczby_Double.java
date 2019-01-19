package _6_dziwne_zachowania;

import java.util.Scanner;

public class PomnozDwieLiczby_Double {
    public static void main(String[] args) {
        Scanner wejscie=new Scanner(System.in);
        System.out.println("Podaj dwie liczby");
        Double arg1=wejscie.nextDouble();
        Double arg2=wejscie.nextDouble();
        Double wynik=arg1*arg2;
        System.out.println(wynik);


    }
}
