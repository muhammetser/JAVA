import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayı Girin: ");


        int num = inp.nextInt();

        int adet = 0,toplam=0;

        while(num != 0)
        {
            toplam +=  (num%10);
            num /= 10;
            ++adet;
        }
        System.out.println("Basamak sayısı : " + adet);
        System.out.println("Basamak toplamı: " + toplam);
    }


}