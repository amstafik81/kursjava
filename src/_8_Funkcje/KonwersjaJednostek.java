package _8_Funkcje;

public class KonwersjaJednostek {
    public static Double mileNaKm(Double e){
        return e*0.62137;

    }
    public static Double kmNaMile(Double e){
        return e/(0.62137);

    }
    public static Double farNaC(Double e){
        return (e-32)/1.8;
    }
    public static Double CnaFar(Double e){
        return (e*1.8) + 32;

    }
}
