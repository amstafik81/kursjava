/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _11_Kalkulator;

/**
 *
 * @author kurs
 */
public class LogikaKalkulatora {
    public static double oblicz(double arg1, double arg2, String operacja) {
        switch(operacja) {
            case "+": return arg1 + arg2;
            case "-": return arg1 - arg2;
            case "*": return arg1 * arg2;
            case "/": return arg1 / arg2;
            default:  throw new IllegalArgumentException("Nieznana operacja " + operacja);
        }
    }
    
}
