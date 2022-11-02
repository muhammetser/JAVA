import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi;
        double harm = 0, uni = 0;

        System.out.print("Sayı giriniz :");
        sayi = input.nextInt();

        for (int i = 1; i <=sayi; i++ ) {
            uni = (1.0 / i);
            harm += uni;
        }
        System.out.println(harm);
    }
}