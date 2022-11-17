import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        System.out.println(number);
        Scanner input = new Scanner(System.in);

        boolean isWin = false;
        boolean isWrong = false;
        int[] wrong = new int[5];
        int right = 0;
        int selected;

        while (right < 5 ) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected >99) {
                System.out.println("Lütfen 0 ve 100 arasında bir sayı girin");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));

                }else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişiniz de hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (selected == number) {
                System.out.print("Tebrikler doğru tahmin ettiniz ! Tahmin ettiğiniz sayı : " + selected);
                isWin = true;
                break;
            }
            else {
                wrong[right++] = selected;
                System.out.println("Hatalı tahminde bulundunuz");
                if (selected > number) {
                    System.out.println(selected+ " Sayısı gizli sayıdan büyüktür.");

                }else {
                    System.out.println(selected + " Sayısı gizli sayıdan küçüktür.");
                }
                System.out.println("Kalan hakkınız : " + (5 - right));
            }
        }
        if (!isWin) {
            System.out.print("Kaybettiniz.");
            if (!isWrong) {
                System.out.print("Tahminleriniz : " + Arrays.toString(wrong));
            }

        }
    }
}