package _7_petle;

import java.math.BigDecimal;
import java.util.Scanner;

public class Parkomat_BigDecimal {
    public static void main(String[] args) {
        Scanner wejscie=new Scanner(System.in);
        System.out.println("Ile godzin bedziesz parkowac");
        int ileCzasu=wejscie.nextBigDecimal();
        BigDecimal oplata=new BigDecimal("3.50");
        BigDecimal ileDoZaplaty=oplata.multiply(BigDecimal.valueOf(ileCzasu));
        System.out.println("Do zapłąty: "+ileDoZaplaty);
        BigDecimal ileWrzucono=new BigDecimal("0");
        int powrownanie=-1;
        while(powrownanie== -1)
        {
            powrownanie=ileWrzucono.compareTo(ileDoZaplaty);
            System.out.println("Prosze wrzucic kase");
           ileWrzucono = ileWrzucono.add(wejscie.nextBigDecimal());
            System.out.println("Wrzuciłes już :"+ileWrzucono);

        }
        if(powrownanie==1) {
            System.out.println("Za duzo pieniedzy wrzuciles, automat zwroci:"+(ileDoZaplaty.subtract(ileWrzucono)));
        }
    }
}
