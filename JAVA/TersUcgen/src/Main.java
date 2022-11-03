import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);

        System.out.print("Basamak Sayisini Giriniz :");
        int say=scr.nextInt();

        for (int i=say;i>0;i--){
            for (int j=say-i;j>0;j--){
                System.out.print(" ");
            }

            for (int k=2*i-1;k>0;k--){
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }

}