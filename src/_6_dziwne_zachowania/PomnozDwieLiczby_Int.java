package _6_dziwne_zachowania;

import java.util.Locale;
import java.util.Scanner;

public class PomnozDwieLiczby_Int {
    public static void main(String[] args) {
        Scanner wejscie=new Scanner(System.in);
        System.out.println("Podaj dwie liczby");
        wejscie.useLocale(Locale.US); //dzięki temu mozemy zamiast przecinka wpisywac kropke dla skanera
        int arg1=wejscie.nextInt();
        int arg2=wejscie.nextInt();
        int wynik=arg1*arg2;
        System.out.println("Zwykłe mnożenie"+wynik);
        System.out.println("Max int wynosi"+Integer.MAX_VALUE);

        try {
            int wynik2=Math.multiplyExact(arg1,arg2);
            System.out.println("Wynik mnożenia poprwnego"+wynik2);
        } catch (ArithmeticException e) {
            System.out.println("Wynik nie miesci sie w zakresie");
        }

    }
}
