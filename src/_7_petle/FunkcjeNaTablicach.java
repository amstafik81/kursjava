package _7_petle;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FunkcjeNaTablicach {
    static  int suma(int[] tablica){
        int sumaa=0;
        for(int element:tablica){
            sumaa+=element;
        }
        return sumaa;
    }
    static int suma2(int[] t){
        int suma=0;
        for(int i=0;i<t.length;i++){
            suma+=t[i];
        }
        return suma;
    }

    static int sumaLiczbParzystych(int[] a){
        int suma=0;
        for(Integer element:a){
            if((element%2)== 0){
                suma+=element;
            }
        }
        return suma;
    }

    static int max(int[] t){
        int maxValue = t[0];
        for(int i=1;i < t.length;i++){
            if(t[i] > maxValue){
                maxValue = t[i];
            }
        }
        return maxValue;
    }
    static Integer max2(int[] t){
        Arrays.sort(t);
        int max=0;
        if(t.length==0) {
             return null;
        }
        return t[t.length - 1];
    }
    //opcja z sortowaniem
    static int min(int[] t){
        int minValue=t[0];
        for(int i=1;i<t.length;i++){
            if(t[i]<minValue){
                minValue=t[i];
            }
        }
        return minValue;
    }
    //podejscie nowoczesne - uzywamy klasy Optional
    static OptionalInt maxxx(int[] t){
        if(t.length==0){
            return OptionalInt.empty();
        }
        int wynik=t[0];
        for(int x:t){
            if(x>wynik){
                wynik=x;
            }
        }
        return OptionalInt.of(wynik);
    }
    public  static int sumaParzyste_strumien(int[] t){
        return IntStream.of(t).filter(x->x%2==0).sum();
    }
    //dla wygody main testujacego
    public static void main(String[] args) {
        int[] a={2,3,2,4,3,2};
        int[] b={-20,0,2,4,1,2};
        int[] c={-10,-20,-30};
        int[] e={};
        System.out.println("Suma tablicy a wynosi: "+suma(a));
        System.out.println("Suma tablicy b wynosi: "+suma(b));
        System.out.println("Suma tablicy a metoda 2 wynosi: "+suma2(a));
        System.out.println("Suma tablicy b metoda 2 wynosi: "+suma2(b));
        System.out.println("Suma inną metodą wynosi:"+ Arrays.stream(a).sum());
        System.out.println("Suma elementów parzysthc dla tablicy a:"+sumaLiczbParzystych(a));
        System.out.println("Suma elementów parzysthc dla tablicy b:"+sumaLiczbParzystych(b));
        System.out.println("Max w tablicy a:"+max(a));
        System.out.println("Max2 w tablicy a:"+max2(e));
        System.out.println("Max w tablicy b:"+max(b));
        System.out.println("Min w tablicy a:"+min(a));
        System.out.println("Min w tablicy b:"+min(b));

    }
}
