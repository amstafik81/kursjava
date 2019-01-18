package _5_zadanie_domowe1_18_01_2019;

import java.util.Scanner;

public class BMI {

    public static int chekAge(Scanner wiek)
    {
        if (wiek < 10)
        {
            System.out.println("Jesteś zbyt młody");
        }
        else if(wiek>100)
        {
            System.out.println("Jestes zbyt stary");
        }
        else
        {
            return wiek;
        }
    }


    public static void main(String[] args) {
        System.out.println("Witaj XYZ podaj nam swoje dane dotyczące obliczenia BMI");
        System.out.println("Podaj nam swój wiek");
        Scanner wiek=new Scanner(System.in).nextLine();
        System.out.println("Podaj nam swój wzrost w centymetrach");
        Scanner wzrost=new Scanner(System.in).nextLine();
        Integer wiekk=Integer.parseInt(wiek);

        Integer wzrostt=Integer.parseInt(wzrost).;




    }
}
