package _8_Funkcje;

public class TestowanieFunkcji {
    public static void main(String[] args) {
       double[] liczby={0,2,3,2,1,2,3};
        for(double liczba:liczby)
       {
           Double kwadrat=FunkcjeGeometryczne.poleKwadratu(liczba);
           Double kolo=FunkcjeGeometryczne.poleKola(liczba);
           System.out.println("Pole kwadratu wynosi:"+kwadrat);
           System.out.println("Pole koła wynosi:"+kolo);

       }
    }
}
