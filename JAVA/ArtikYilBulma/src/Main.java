import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;

        Scanner inp = new Scanner(System.in);
        System.out.print("Yıl giriniz : ");
        yil = inp.nextInt();

        if ((yil % 4 ==0) || (yil % 400 ==0)){
            System.out.print(yil + " artık yıldır. ");

        }
        else {
            System.out.print(yil +" artık yıl değildir.");
        }
    }
}