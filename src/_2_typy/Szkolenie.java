package _2_typy;

import java.time.LocalDate;

public class Szkolenie {
    double cena;
    int liczbaUczestnikow;
    String nazwa;
    LocalDate data;
    Adres adres;
    //1.tworzenie nowego obiektu
    //budowa konstruktora = [public/private] [nazwa] [(lista parametrów)]
    //kontruktor bezparametryczny
    public Szkolenie(){
        System.out.println("wykonał sie konstrutor bezparametryczny");
    }
    //konstruktor parametryczny
    public Szkolenie(String nazwa, int liczba, double cena,LocalDate data,Adres adres){
        System.out.println("Wykonał sie konstruktor parameryczny");
        this.nazwa=nazwa;
        this.liczbaUczestnikow=liczba;
        this.cena=cena;
        this.data=data;
        this.adres=adres;
    }


    //2.wypisanie informacji o obiekcie
    //tworzenie metody
    //[public/private] [typ zwracany] [nazwa] [(lista parametrow)]


    public void wyswietl(){
       System.out.println("Nazwa szkolenia:"+this.nazwa);
       System.out.println("Ilosc uczestnikow "+this.liczbaUczestnikow);
       System.out.println("Cena szkolenia "+this.cena);
       System.out.println("Data szkolenia"+this.data);
       adres.wyswietl();


   }



}
