import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int numara, n, buyukNumara = 0, kucukNumara = 0;
        System.out.print("Lütfen kaç tane sayı gireceğinizi yazınız : ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Lütfen " + i + ". numara:");
            numara = inp.nextInt();
            if (i == 1) {
                buyukNumara = numara;
                kucukNumara = numara;
            } else {
                if (numara > buyukNumara) {
                    buyukNumara = numara;
                } else if (numara < kucukNumara) {
                    kucukNumara = numara;
                }
            }
        }
        System.out.println("Büyük numara :" + buyukNumara);
        System.out.println("Küçük numara :" + kucukNumara);
    }
}