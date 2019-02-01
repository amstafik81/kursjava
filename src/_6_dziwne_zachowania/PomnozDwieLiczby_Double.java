package _6_dziwne_zachowania;

import java.util.Locale;
import java.util.Scanner;

public class PomnozDwieLiczby_Double {
    public static void main(String[] args) {
        Scanner wejscie=new Scanner(System.in);
        System.out.println("Podaj dwie liczby");
        wejscie.useLocale(Locale.US); //dzięki temu mozemy zamiast przecinka wpisywac kropke dla skanera
        Double arg1=wejscie.nextDouble();
        Double arg2=wejscie.nextDouble();
        Double wynik=arg1*arg2;
        System.out.println(wynik);

    }
}
