package _2_typy;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;

public class OblugaSzkolen {
    public static void main(String[] args) {
        Szkolenie szkolenieJava=new Szkolenie("Szkolenie Java",10,1000,LocalDate.of(2018, Month.DECEMBER,15));
        System.out.println("\n\n");
        Szkolenie szkoleniePython=new Szkolenie("Szkolenie Python",10,1000,LocalDate.of(2018, Month.DECEMBER,15));
        szkolenieJava.wyswietl();
        szkoleniePython.wyswietl();
    }
}
