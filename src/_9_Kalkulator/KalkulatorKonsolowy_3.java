package _9_Kalkulator;

import java.util.Scanner;

public class KalkulatorKonsolowy_3 {



    public static void main(String[] args) {
        Scanner wejscie=new Scanner(System.in);
        System.out.println("Podawaj kolejne działania w formie");
        System.out.println(" 12 + 15");
        System.out.println("Zakończ wpisujac koniec");
        System.out.println();
        while(true){
            System.out.println("> ");
            if(!wejscie.hasNextDouble()) {
            break; //koniec
            }
            try {
               double arg1=wejscie.nextDouble();
               String operacja=wejscie.next();
               double arg2=wejscie.nextDouble();
                System.out.println("Operacja:"+arg1+operacja+arg2);
                obicz(arg1, operacja, arg2);
            }
            catch (Exception e){
                System.out.println("Bład: "+e);
                System.out.println("Błąd: "+e.getMessage());
            }
        }
        System.out.println("Dzięki papa");

    }

    private static void obicz(double arg1, String operacja, double arg2) {

        switch (operacja){
            case "+":
                System.out.println("Wynik dodawania za pomoca switch "+(arg1+arg2));
                break;
            case "*":
                System.out.println("Wynik mnożenia za pomoca switch "+(arg1*arg2));
                break;
            default:
                throw new IllegalArgumentException("Nieznana operacja");
               // System.out.println("Wynik operacji wynosi 0");
        }
    }
}
