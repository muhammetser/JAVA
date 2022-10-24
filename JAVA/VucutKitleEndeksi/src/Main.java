import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy, kilo, vctİndks;



        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (Metre cinsinden) giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextDouble();


        vctİndks = (kilo / (boy*boy));
        System.out.print("Vücut kitle indeksiniz : "+vctİndks);



    }
}