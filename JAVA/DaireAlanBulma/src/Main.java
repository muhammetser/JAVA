import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, a;
        double pi = 3.14, formul;

        Scanner inp = new Scanner(System.in);
        System.out.print("Yarı çapı giriniz : ");
        r = inp.nextInt();
        System.out.print("Merkez Açısı Giriniz : ");
        a = inp.nextInt();

        formul = (pi * (r*r)*a) /360;

        System.out.print("Alan : " + formul);



    }
}