package _7_petle;

import java.util.Scanner;

public class Parkomat {
    public static void main(String[] args) {
        Scanner wejscie=new Scanner(System.in);
        System.out.println("Ile godzin bedziesz parkowac");
        int ileCzasu=wejscie.nextInt();
        int oplata=3;
        int ileDoZaplaty=ileCzasu*oplata;
        System.out.println("Do zapłąty: "+ileDoZaplaty);
        int ileWrzucono=0;
        while(ileWrzucono<ileDoZaplaty)
        {
            System.out.println("Prosze wrzucic kase");
            ileWrzucono+=wejscie.nextInt();
        }
        if(ileWrzucono>ileDoZaplaty) {
            System.out.println("Za duzo pieniedzy wrzuciles, automat zwroci:"+Math.abs(ileDoZaplaty-ileWrzucono));
        }
    }
}
