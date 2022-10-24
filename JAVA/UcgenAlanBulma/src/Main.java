import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x,y,z,u;
        double alan;

        Scanner inp = new Scanner(System.in);
        System.out.print("1.Kenarı giriniz : ");
        x = inp.nextInt();
        System.out.print("2.Kenarı giriniz : ");
        y = inp.nextInt();
        System.out.print("3.Kenarı giriniz : ");
        z = inp.nextInt();

        u = (x+y+z) /2;

        alan = Math.sqrt(u * (u-x) * (u-y) * (u-z));
        System.out.println("Üçgen çevresi : "+ u);
        System.out.println("Üçgen alanı :" + alan);



    }
}