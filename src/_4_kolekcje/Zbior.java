package _4_kolekcje;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Zbior {
    public static void main(String[] args) {
        Set<String> numeryPesel=new HashSet();
        numeryPesel.add("434343434343");
        numeryPesel.add("3232313123123");
        numeryPesel.add("3323232323323");
        numeryPesel.add("3323232323323");
        numeryPesel.remove(1);
        System.out.println(numeryPesel);
        System.out.println(numeryPesel.contains("32323"));
        Set<String> posortowane=new TreeSet<String>();
        posortowane.addAll(numeryPesel);
        System.out.println(posortowane);
        Set<String> kolejnosc=new LinkedHashSet<String>();
        kolejnosc.addAll(numeryPesel);
        System.out.println(kolejnosc);

    }
}
