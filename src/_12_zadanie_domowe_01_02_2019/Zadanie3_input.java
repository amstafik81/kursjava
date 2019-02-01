package _12_zadanie_domowe_01_02_2019;

import javax.swing.*;

public class Zadanie3_input {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        boolean wynik=true;
        while (wynik){
            String name =JOptionPane.showInputDialog(frame,"Podaj swoje imie");
            if(name.equals("Java")){
                wynik=false;
                System.exit(0);
            }
        }


    }
}
