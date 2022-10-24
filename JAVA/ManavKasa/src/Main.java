import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz =0.95, patlıcan = 5.00,
                armut1, elma1, domates1, muz1, patlıcan1, Tplm;


        Scanner inp = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo : ");
        armut1 = inp.nextDouble();

        System.out.print("Elma Kaç Kilo : ");
        elma1 = inp.nextDouble();

        System.out.print("Domates Kaç Kilo : ");

        domates1 =  inp.nextDouble();

        System.out.print("Muz Kaç Kilo : ");
        muz1 = inp.nextDouble();

        System.out.print("Patlıcan Kaç Kilo : ");
        patlıcan1 = inp.nextDouble();


        Tplm = ((armut1*armut) + (elma1*elma) + (domates1*domates) + (muz1*muz) + (patlıcan1*patlıcan));
        System.out.print("Toplam Tutar : "+ Tplm);




    }
}