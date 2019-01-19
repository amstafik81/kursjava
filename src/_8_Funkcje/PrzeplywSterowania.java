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
        powtorz("napis",2);
    }
    static void metoda2(){
        System.out.println("Metoda2");
    }
    static int powtorz(String napis,int ileRazy){
        for(int i=0;i<ileRazy;i++){
            System.out.println(napis);
        }
        return  napis.length()*ileRazy;
    }
}
