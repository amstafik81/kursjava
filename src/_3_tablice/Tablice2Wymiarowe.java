package _3_tablice;

import java.util.Random;

public class Tablice2Wymiarowe {
    public static void main(String[] args) {
        int [][] tablica=new int [4][4];
        for(int i=0;i<tablica.length;i++){
            for(int j=0;j<tablica[i].length;j++){
                if(tablica[i][j] == 1)
                    System.out.print('X' + "\t");
                else
                    System.out.print(tablica[i][j] + "\t");
            }
            System.out.print("\n");
        }
        for(int i=0;i<tablica.length;i++) {

            for (int j = 0; j < tablica[i].length; j++) {

                tablica[i][j]=new Random().nextInt(100);

            }
            for(int j=0;j<tablica[i].length;j++){
                if(tablica[i][j] == 1)
                    System.out.print('X' + "\t");
                else
                    System.out.print(tablica[i][j] + "\t");
            }
            System.out.print("\n");

        }
    }
}
