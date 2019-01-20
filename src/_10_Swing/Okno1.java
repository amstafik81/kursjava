package _10_Swing;

import javax.swing.*;

public class Okno1 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setTitle("Nasze okno");
        JLabel label=new JLabel("Ala ma kota");
        frame.add(label);
        frame.setVisible(true);
    }
}
