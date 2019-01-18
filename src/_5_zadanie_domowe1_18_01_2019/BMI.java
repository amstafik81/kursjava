package _5_zadanie_domowe1_18_01_2019;

import java.math.BigDecimal;
import java.util.Scanner;

public class BMI {

    public static float zaokr(double liczba, int decimalPlace)
    {
        BigDecimal bd=new BigDecimal(liczba);
        bd=bd.setScale(decimalPlace,BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }


    public static void main(String[] args) {
        Scanner odczyt=new Scanner(System.in);
        System.out.println("Witaj XYZ podaj nam swoje dane dotyczące obliczenia BMI");
        System.out.println("Podaj nam swoją wage");
        double waga=odczyt.nextDouble();
        System.out.println("Podaj nam swój wzrost ");
        double wzrost=odczyt.nextDouble();
        Double bmi=(waga/((wzrost/100)*2));

        float wskaznik=zaokr(bmi,2);
        if(wskaznik<16)
        {
            System.out.println("Wyglodzenie");
        }
        else if(wskaznik>16 && wskaznik<16.99)
        {
            System.out.println("Wychudzenie");
        }
        else if(wskaznik>17 && wskaznik<18.49)
        {
            System.out.println("Niedowaga");
        }
        else if(wskaznik>18.5 && wskaznik<24.99)
        {
            System.out.println("Waga prawidłowa");
        }
        else if(wskaznik>25 && wskaznik<29.99)
        {
            System.out.println("Nadwaga");
        }
        else if(wskaznik>30 && wskaznik<34.99)
        {
            System.out.println("I stopień otyłości");
        }
        else if(wskaznik>35 && wskaznik<39.99)
        {
            System.out.println("II stopień otyłości");
        }
        else if(wskaznik>40 )
        {
            System.out.println("Ty knurze");
        }










    }
}
