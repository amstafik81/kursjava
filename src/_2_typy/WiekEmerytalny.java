package _2_typy;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WiekEmerytalny {
    public static void main(String[] args) {

        System.out.print("Podaj date swoich urodzin w formacie (yyyy-mm-dd):");
        String dataUr=new Scanner(System.in).nextLine();
        LocalDate localDate=LocalDate.parse(dataUr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        int lata=Period.between(localDate,LocalDate.now()).getYears();
        System.out.println(lata);

        if(lata<65 && lata>18){
            System.out.println("Jestes w wieku produkcyjnym");

        }
        else if(lata<18){
            System.out.println("Jest za mlody");
        }
        else {
            System.out.println("Juz na emeryturze");
        }


    }
}
