import java.util.Scanner;
import  java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};

        Scanner inp = new Scanner(System.in);
        System.out.println(Arrays.toString(list));
        System.out.print("Girilen sayı : ");
        int number = inp.nextInt();

        Arrays.sort(list);
        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < number) {
                min = i;
            }
            if (i > number) {
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}