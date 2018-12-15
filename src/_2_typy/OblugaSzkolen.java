package _2_typy;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;

public class OblugaSzkolen {
    public static void main(String[] args) {
        Adres adres=new Adres("Stawowa 10","34-300","Katowice");
        Szkolenie szkolenieJava=new Szkolenie("Szkolenie Java",10,1000,LocalDate.of(2018, Month.DECEMBER,15),adres);
        System.out.println("\n\n");
        Szkolenie szkoleniePython=new Szkolenie("Szkolenie Python",10,1000,LocalDate.of(2018, Month.DECEMBER,15),adres);
        szkolenieJava.wyswietl();
        szkoleniePython.wyswietl();



    }
}
