package _8_Funkcje;

import java.util.Scanner;

public class Program_Uzywajacy_Funkcje {


    public static void main(String[] args) {
        Scanner wejscie=new Scanner(System.in);
        System.out.println("Podaj dlugosc");
        Double dl=wejscie.nextDouble();
        System.out.println("Pole kwadratu wynosi:"+FunkcjeGeometryczne.poleKwadratu(dl));
        System.out.println("Pole koła wynosi:"+FunkcjeGeometryczne.poleKola(dl));





    }
}
