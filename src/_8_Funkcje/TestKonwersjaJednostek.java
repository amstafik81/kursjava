package _8_Funkcje;

import java.util.Scanner;

public class TestKonwersjaJednostek {
    public static void main(String[] args) {
        Scanner wejscie=new Scanner(System.in);
        System.out.println("Podaj ile mil chcesz zamienić na km.");
        double mile=wejscie.nextDouble();
        System.out.println("Podana ilość mil to: "+KonwersjaJednostek.mileNaKm(mile));
        System.out.println("Podaj ile km chcesz zamienc na mile");
        double km=wejscie.nextDouble();
        System.out.println("Podana ilość km to tyle mil: "+KonwersjaJednostek.kmNaMile(km));
        System.out.println("Podaj ile far chcesz zamienc na celsjusze");
        double far=wejscie.nextDouble();
        System.out.println("Podana ilość far to tyle celsjuszy: "+KonwersjaJednostek.farNaC(far));
        System.out.println("Podaj ile celsjuszy chcesz zamienc na far");
        double cel=wejscie.nextDouble();
        System.out.println("Podana ilość celsjuszy to tyle far: "+KonwersjaJednostek.CnaFar(cel));

    }
}
