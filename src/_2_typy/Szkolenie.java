package _2_typy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Szkolenie {
    BigDecimal cena;
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
    public Szkolenie(String nazwa, int liczba, double cena ,LocalDate data,Adres adres){
        System.out.println("Wykonał sie konstruktor parameryczny");
        this.nazwa=nazwa;
        this.liczbaUczestnikow=liczba;
        this.cena=new BigDecimal(cena);
        this.data=data;
        this.adres=adres;
    }


    //2.wypisanie informacji o obiekcie
    //tworzenie metody
    //[public/private] [typ zwracany] [nazwa] [(lista parametrow)]


    public void wyswietl(){
       System.out.println("Nazwa szkolenia: "+this.nazwa);
       System.out.println("Ilosc uczestnikow: "+this.liczbaUczestnikow);
       System.out.println("Cena szkolenia: "+this.cena);
       System.out.println("Data szkolenia: "+this.data);
       adres.wyswietl();
       System.out.println("Zysk brutto szkolenia: "+obliczPrzychodBrutto());
       System.out.println("Zysk netto szkolenia: "+obliczPrzychodNetto());
       System.out.println("Kwota podatku vat: "+(obliczPrzychodBrutto().subtract(obliczPrzychodNetto())));
   }

   public BigDecimal obliczPrzychodBrutto(){

        return cena.multiply(BigDecimal.valueOf(liczbaUczestnikow));
   }

   public BigDecimal obliczPrzychodNetto(){

        return obliczPrzychodBrutto().divide(BigDecimal.ONE.add(StaleAplikacji.STAWKA_VAT),2, RoundingMode.HALF_UP);
   }

}
