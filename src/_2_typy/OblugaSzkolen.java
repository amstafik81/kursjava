package _2_typy;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;

public class OblugaSzkolen {
    public static void main(String[] args) {
        Szkolenie szkolenieJava=new Szkolenie("Szkolenie Java",10,1000,LocalDate.of(2018, Month.DECEMBER,15));
        szkolenieJava.nazwa="Szkolenie Java";
        szkolenieJava.cena=1000;
        szkolenieJava.liczbaUczestnikow=10;
        szkolenieJava.data= LocalDate.of(2018, Month.DECEMBER,15);

        Szkolenie szkoleniePython=new Szkolenie();
        szkoleniePython.nazwa="Szkolenie Python";
        szkoleniePython.cena=2000;
        szkoleniePython.liczbaUczestnikow=20;
        szkoleniePython.data=LocalDate.of(2018,Month.DECEMBER,15);


        System.out.println("Nazwa szkolenia:"+szkolenieJava.nazwa);
        System.out.printf("Cena szkolenia: %.2f PLN \n",szkolenieJava.cena);
        System.out.println("Ilosc uczestnikow "+szkolenieJava.liczbaUczestnikow);
        System.out.println("Data:"+szkolenieJava.data);
        System.out.println("\n\n\n");
        System.out.println("Nazwa szkolenia:"+szkoleniePython.nazwa);
        System.out.printf("Cena szkolenia: %.2f \n",szkoleniePython.cena);
        System.out.println("Ilosc uczestnikow "+szkoleniePython.liczbaUczestnikow);
        System.out.println("Data:"+szkoleniePython.data);

    }
}
