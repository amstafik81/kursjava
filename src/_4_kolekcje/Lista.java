package _4_kolekcje;

import java.util.*;

public class Lista {
    public static void main(String[] args) {
        List<String> imiona=new ArrayList<String>();
        imiona.add("Tomek");
        imiona.add("Krysia");
        imiona.add("Zenek");
        imiona.add("Ziuta");

       // System.out.println(imiona);
       // System.out.println(imiona.get(1));

        for(String tmp : imiona){
            if(tmp.endsWith("a")){
                System.out.println(tmp);
            }
        }
        imiona.remove(1);
        //sortowanie
        imiona.sort(Comparator.reverseOrder());
        Collections.sort(imiona);
        if(imiona.contains("Justyna")){
            System.out.println("Jest");
        }
        else {
            System.out.println("Nie wystepuje");
        }

    }
}
