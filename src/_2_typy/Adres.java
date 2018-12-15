package _2_typy;

public class Adres {
    String ulica;
    String kodPocztowy;
    String miasto;
    public Adres(){
        System.out.println("Konstruktor bezparametowy");
    }

    public Adres(String ulica,String kod,String miasto){
        System.out.println("Konstruktor parametrowy");
        this.ulica=ulica;
        this.kodPocztowy=kod;
        this.miasto=miasto;
    }

    public void wyswietl(){
        System.out.println("Ulica:"+this.ulica);
        System.out.println("Kod pocztowy:"+this.kodPocztowy);
        System.out.println("Miasto:"+this.miasto);
    }
}
