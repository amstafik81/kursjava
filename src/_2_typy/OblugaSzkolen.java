package _2_typy;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;

public class OblugaSzkolen {
    public static void main(String[] args) {
        Szkolenie szkolenieJava=new Szkolenie("Szkolenie Java",10,1000,LocalDate.of(2018, Month.DECEMBER,15));
        System.out.println("\n\n");
        Szkolenie szkoleniePython=new Szkolenie("Szkolenie Python",10,1000,LocalDate.of(2018, Month.DECEMBER,15));

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
