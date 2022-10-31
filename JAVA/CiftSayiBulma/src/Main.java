import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int d,toplam = 0, sayac = 0;

        Scanner  inp = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        d = inp.nextInt();
        for(int i =0; i < d; i++){
            if((i % 3 == 0) && (i % 4 == 0)){
                toplam +=i;
                sayac++;

            }
        }
        int ortalama = toplam / sayac;
        System.out.print("Girdiğiniz sayıya kadar 3 ve 4 e tam bölünen sayıların ortalaması : "+ortalama);



    }
}