package _5_zadanie_domowe1_18_01_2019;
import java.util.*;
import java.util.Collections;

public class ListaZakupow {

    public static void main(String[] args) {
        ArrayList<Produkt> lista = new ArrayList<Produkt>();
        System.out.println("Podaj ile chcesz wprowadzic towarow: ");
        Scanner input = new Scanner(System.in);
        int ileTowarow = input.nextInt();
        for (int i = 0; i < ileTowarow; i++) {
            System.out.println("Podaj nazwe towaru:");
            String nazwaTowaru = input.next();
            System.out.println("Podaj cene towaru:");
            float cenaTowaru = input.nextFloat();
            System.out.println("Podaj ilość towaru");
            int ileTowaru = input.nextInt();
            lista.add(new Produkt(nazwaTowaru, cenaTowaru, ileTowaru));
        }

        float suma=0;
        for(Produkt element:lista)
        {
            suma=suma+element.cena*element.ilosc;
        }
        lista.m
        System.out.println(suma);
    }

}


