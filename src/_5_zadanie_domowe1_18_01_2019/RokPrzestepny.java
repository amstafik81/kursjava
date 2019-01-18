package _5_zadanie_domowe1_18_01_2019;

import java.util.Scanner;

public class RokPrzestepny {

    public static boolean przestepny(int rok)
    {
        return ((rok %4==0) && (rok %100 !=0) || (rok % 400 ==0));
    }



    public static void main(String[] args) {

        System.out.println("Podaj rok który należy sprawdzic w formacie YYYY");
        String rok=new Scanner(System.in).nextLine();
        Integer rokk=Integer.parseInt(rok);
        if(przestepny(rokk))
        {
            System.out.println("rok jest przestepny");
        }
        else
        {
            System.out.println("Rok nie jest przestepny");
        }



    }
}
