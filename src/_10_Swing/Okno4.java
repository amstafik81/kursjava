package _10_Swing;

import javax.swing.*;
import java.awt.*;

import static java.awt.Font.BOLD;

public class Okno4 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setTitle("Nasze okno");
        JLabel label=new JLabel("Ala ma kota");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Arial", BOLD,40));
        label.setForeground(Color.RED);
        //rozne mozliwości ustwiania kolorow
       // Color kolorTla=Color.YELLOW;
        //druga mozliwosc
       // Color kolorTla=new Color(1.0f,1.0f,0.9f);
        //mozna równiez dodac zakres kolorow jaki int
        //Color kolorTla=new Color(255,255,200);
        //mozna zakodowac za pomoca jak np w css
        Color kolorTla=new Color(0x9F57FF);
        label.setOpaque(true);
        label.setBackground(kolorTla);
        frame.add(label);
        JButton button=new JButton("Ok");
        button.setFont(new Font("Arial",BOLD,13));
       // frame.add(button,BorderLayout.NORTH);
        frame.add(button);





        frame.setVisible(true);
    }
}
