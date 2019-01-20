package _9_Kalkulator;

import java.util.Scanner;

public class KalkulatorKonsolowy_2 {



    public static void main(String[] args) {
        Scanner wejscie=new Scanner(System.in);
        System.out.println("Podawaj kolejne działania w formie");
        System.out.println(" 12 + 15");
        System.out.println("Zakończ wpisujac koniec");
        System.out.println();
        while(true){
            System.out.println("> ");
            try{
               double arg1=wejscie.nextDouble();
               String operacja=wejscie.next();
               double arg2=wejscie.nextDouble();
                System.out.println("Operacja:"+arg1+operacja+arg2);
                obicz(arg1, operacja, arg2);
            }
            catch (Exception e){
                break;
            }
        }
        System.out.println("Dzięki papa");

    }

    private static void obicz(double arg1, String operacja, double arg2) {
        double wynik;
        switch (operacja){
            case "+":
                System.out.println("Wynik dodawania za pomoca switch "+(arg1+arg2));
                break;
            case "*":
                System.out.println("Wynik mnożenia za pomoca switch "+(arg1*arg2));
                break;
            default:
                System.out.println("Wynik operacji wynosi 0");
        }
    }
}
