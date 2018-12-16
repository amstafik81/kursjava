package _4_kolekcje;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String,Integer> inwentarz=new HashMap();
        inwentarz.put("Proszek",1);
        inwentarz.put("Mydlo",3);
        inwentarz.put("Maka",4);
        inwentarz.put("Maka",4);
        System.out.println(inwentarz);

        System.out.println(inwentarz.get("iii"));
        System.out.println(inwentarz.keySet());


    }
}
