package _2_typy;

import java.time.LocalDate;

public class Szkolenie {
    double cena;
    int liczbaUczestnikow;
    String nazwa;
    LocalDate data;
    //1.tworzenie nowego obiektu
    //kontruktor bezparametryczny
    public Szkolenie(){
        System.out.println("wykonał sie konstrutor bezparametryczny");
    }
    //konstruktor parametryczny
    public Szkolenie(String nazwa, int liczba, double cena,LocalDate data){
        System.out.println("Wykonał sie konstruktor parameryczny");
        this.nazwa=nazwa;
        this.liczbaUczestnikow=liczba;
        this.cena=cena;
        this.data=data;
        System.out.println(this.nazwa);

    }

    //2.wypisanie informacji o obiekcie
    //


}
