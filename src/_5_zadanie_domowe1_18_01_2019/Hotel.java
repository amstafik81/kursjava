package _5_zadanie_domowe1_18_01_2019;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Hotel {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Witamy w Hotelu, ażeby poznać oferte proszę podać kilka danych ");
        System.out.println("Prosze podać datę przyjazdu w formacie YYYY-MM-DD");
        LocalDate dataPrzyjazdu=LocalDate.parse(input.nextLine(),DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Podaj datę wyjazdu");
        LocalDate dataWyjzdu=LocalDate.parse(input.nextLine(),DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Data przyjazdu"+dataPrzyjazdu);

        Period p=Period.between(dataPrzyjazdu,dataWyjzdu);
        Long dni=ChronoUnit.DAYS.between(dataPrzyjazdu,dataWyjzdu);
        System.out.println(dni);
        System.out.println("Proszę podać ile osób dorosłych");
        int ileDoroslych=input.nextInt();
        System.out.println("Proszę podać ile  dzieci");
        int ileDzieci=input.nextInt();
        System.out.println("Proszę podać ile dzieci w wieku niemowlęcym");
        int ileNiemowlat=input.nextInt();
        System.out.println();
        int doZaplaty;
        if(dni>7)
        {
             doZaplaty=(ileDoroslych*(180-18)+ileDzieci*(90-9)+ileNiemowlat*(20-2))*dni.intValue();
        }
        else
        {
            doZaplaty=(ileDoroslych*(180)+ileDzieci*(90)+ileNiemowlat*(20))*dni.intValue();
        }

        System.out.println("Do zapłaty "+doZaplaty);

    }
}
