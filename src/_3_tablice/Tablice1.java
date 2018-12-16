package _3_tablice;

public class Tablice1 {
    public static void main(String[] args) {
        int[] tablica=new int[8];
        System.out.println("Dlugosc tablicy:"+tablica.length);
        System.out.println("Element 3. tablicy: "+tablica[2]);
       // System.out.println("Element nieistniejący: "+tablica[8]);
        //pojawia sie wtedy wyjatek

        System.out.println(tablica[7]);
        int[] tablicaWypelniona={178,176,189,167};
        for(int i=tablicaWypelniona.length-1;i>=0;i--){
            System.out.println(tablicaWypelniona[i]);
        }
        for(int i=tablicaWypelniona.length-1;i>=0;i--){
            System.out.println(tablicaWypelniona[i]);
        }
        for(int i=0;i<tablicaWypelniona.length;i++){
            if (tablicaWypelniona[i]%2==0){
                System.out.println("Element parzysty "+tablicaWypelniona[i]);
            }
            //System.out.println(tablicaWypelniona[i]);
        }
        //pokaz co drugi element
        for(int i=tablicaWypelniona.length-1;i>=0;i+=2){
            System.out.println(tablicaWypelniona[i]);
        }

    }
}
