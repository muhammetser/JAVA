import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner inp = new Scanner(System.in);
        System.out.print("Hava Sıcaklığını Giriniz:");
        heat = inp.nextInt();
        if (heat < 5){
            System.out.print("Kayak yapabilirsiniz.");

        }
        else if (heat < 15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if ((heat >5) && (heat<25)) {
            System.out.println("Pikniğe gidebilirsiniz.");

        }
        else if (heat >25) {
            System.out.print("Yüzmeye gidebilirsiniz.");
        }


    }
}