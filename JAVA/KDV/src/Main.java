import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kdv = 0.18 , kdv1 = 0.08;
        int tutar ;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı giriniz :");
        tutar = input.nextInt();

        double toplamkdv= (tutar > 1000) ? tutar * kdv1 : tutar * kdv;
        System.out.println("Kdv'siz tutar : "+tutar);
        System.out.println("KDV'li tutar : "+(tutar+toplamkdv));
        System.out.println("KDV tutarı : "+ toplamkdv);


    }
}