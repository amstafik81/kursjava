package _6_dziwne_zachowania;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class PomnozDwieLiczby_BigDecimal {
    public static void main(String[] args) {
        Scanner wejscie=new Scanner(System.in);
        System.out.println("Podaj dwie liczby");
        wejscie.useLocale(Locale.US); //dzięki temu mozemy zamiast przecinka wpisywac kropke dla skanera
        BigDecimal arg1=wejscie.nextBigDecimal();
        BigDecimal arg2=wejscie.nextBigDecimal();
        BigDecimal wynik=arg1.multiply(arg2);

        wynik=wynik.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Zwykłe mnożenie"+wynik);

    }
}
