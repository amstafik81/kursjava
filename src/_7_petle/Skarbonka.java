package _7_petle;

import java.math.BigDecimal;
import java.util.Scanner;

public class Skarbonka {
    public static void main(String[] args) {
        Scanner wejscie=new Scanner(System.in);

        int skarbonka=0;
        while(skarbonka<100)
        {
            System.out.println("Wrzuc pieniązki");
            skarbonka=skarbonka+wejscie.nextInt();

        }
        System.out.println("Juz masz odpowiednia kase");

    }
}
