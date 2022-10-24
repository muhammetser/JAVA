import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km;
        double PerKm = 2.20, total, StartPrice = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("KM cinsinden mesafeyi giriniz : ");
        km = input.nextInt();


        total = (km * PerKm);
        total += StartPrice;
        total = ( total < 20) ? 20 : total;


        System.out.print("Taksimetre ücreti : " + total);



    }
}