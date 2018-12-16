package _2_typy;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WiekEmerytalny {
    public static void main(String[] args) {



        Boolean done=false;
        while (!done){
            try{
                System.out.print("Podaj date swoich urodzin w formacie (yyyy-mm-dd):");
                String dataUr=new Scanner(System.in).nextLine().toLowerCase();
                LocalDate localDate=LocalDate.parse(dataUr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                System.out.print("Podaj plec (K lub M)");
                String plec=new Scanner(System.in).nextLine();

                int lata=Period.between(localDate,LocalDate.now()).getYears();
                if (plec.equalsIgnoreCase("K")){
                    if(lata<=65 && lata>=18){
                        System.out.println("Jestes w wieku produkcyjnym");
                    }
                    else if(lata<18){
                        System.out.println("Jest za mlody");
                    }
                    else {
                        System.out.println("Juz na emeryturze");
                    }
                }
                else if(plec.equalsIgnoreCase("M")){
                    if(lata<=67 && lata>=18){
                        System.out.println("Jestes w wieku produkcyjnym");
                    }
                    else if(lata<18){
                        System.out.println("Jest za mlody");
                    }
                    else {
                        System.out.println("Juz na emeryturze");
                    }

                }
                else{
                    System.out.println("Podaj prawidłową płeć");
                }

            done=true;
            }
            catch (java.time.format.DateTimeParseException e){
                System.out.println("Popraw date");

            }
        }







    }
}
