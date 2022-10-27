import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double fiyat, indirim, indirimliFiyat, gidisDonus;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        yolculukTipi = input.nextInt();

        fiyat = mesafe * 0.10;

        if(mesafe < 0 || yas < 0 || (yolculukTipi != 1 && yolculukTipi != 2) )
            System.out.println("\"Hatalı Veri Girdiniz !\" ");

        if(yas < 12) {
            indirim = fiyat * 0.50;
            indirimliFiyat = fiyat - indirim;
        }
        else if (yas <= 24) {
            indirim = fiyat * 0.10;
            indirimliFiyat = fiyat - indirim;
        }
        else if (yas >= 65) {
            indirim = fiyat * 0.30;
            indirimliFiyat = fiyat - indirim;
        }
        else {
            indirimliFiyat = fiyat;
        }

        if(yolculukTipi == 2) {
            gidisDonus = indirimliFiyat - (indirimliFiyat * 0.20);
            System.out.println("Gidiş dönüş biletlerinizin fiyatı:" + gidisDonus * 2);
        }
        else if(yolculukTipi == 1){
            System.out.println("Tek yönlü bilet aldınız.İndirimli Tutar: " +indirimliFiyat);
        }
    }
}