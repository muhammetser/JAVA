import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Dizinin boyutu n : ");
        n = input.nextInt();
        int[] number  = new int[n];
        int s = 1;

        for (int i = 0; i < number.length; i++) {
            System.out.print(s + ". Elemanı giriniz : ");
            number[i] = input.nextInt();
            s +=1;
        }

        Arrays.sort(number);
        System.out.print("Sıralama : " + Arrays.toString(number));

    }
}