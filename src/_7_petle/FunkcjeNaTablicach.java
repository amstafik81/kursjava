package _7_petle;

import java.lang.reflect.Array;
import java.util.Arrays;

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

    //dla wygody main testujacego
    public static void main(String[] args) {
        int[] a={2,3,2,4,3,2};
        int[] b={-20,0,2,4,1,2};
        System.out.println("Suma tablicy a wynosi: "+suma(a));
        System.out.println("Suma tablicy b wynosi: "+suma(b));
        System.out.println("Suma tablicy a metoda 2 wynosi: "+suma2(a));
        System.out.println("Suma tablicy b metoda 2 wynosi: "+suma2(b));
        System.out.println("Suma inną metodą wynosi:"+ Arrays.stream(a).sum());

    }
}
