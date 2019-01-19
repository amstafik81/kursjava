package _8_Funkcje;

public class PrzeplywSterowania {
    static void meteoda1(){
        System.out.println("Metoda1");
    }
    public static void main(String[] args) {
        System.out.println("Poczatek programu");
        meteoda1();
        System.out.println("Znowu jestem w main");
        meteoda1();
        System.out.println("Metoda1");
        metoda2();
    }
    static void metoda2(){
        System.out.println("Metoda2");
    }
}
