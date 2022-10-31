import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int s;
        int total=0;


        do {
            Scanner inp = new Scanner(System.in);

            System.out.print("Lütfen bir sayı girin : ");
            s = inp.nextInt();
            if ((s % 2 == 0) && (s % 4 == 0)) {
                total+=s;

            }

        } while (s%2==0);
        System.out.println("Toplam:"+total);


    }
}