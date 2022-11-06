import java.util.Scanner;

public class Main {
    static void asal(int sayi, int x){
        if (x == sayi){
            System.out.println(sayi + " sayisi asal sayidir.");
            return;
        }else if (sayi % x == 0){
            System.out.println(sayi + "  sayisi asal sayi degildir.");
            return ;
        }
        asal(sayi,x + 1);

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi;
        System.out.print("Sayi giriniz :");
        sayi=inp.nextInt();
        asal(sayi,2);
    }
}