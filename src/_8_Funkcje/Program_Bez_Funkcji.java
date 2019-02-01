package _8_Funkcje;

import java.net.ServerSocket;
import java.util.Scanner;

public class Program_Bez_Funkcji {


    public static void main(String[] args) {
        Scanner wejscie=new Scanner(System.in);
        System.out.println("Podaj dlugosc boku");
        Double dlBoku=wejscie.nextDouble();
        Double poleKwadratu=Math.pow(dlBoku,2);
        System.out.println("Pole kwadratu wynosi: "+poleKwadratu);
        Double poleKola=Math.PI*dlBoku*dlBoku;
        System.out.println("Pole koła wynosi: "+poleKola);





    }
}
