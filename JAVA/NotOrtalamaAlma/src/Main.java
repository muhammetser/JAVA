import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat,fizik,turkce,kimya,muzik,ortalama=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextDouble();
        System.out.print("Fizik Notunuz: ");
        fizik = input.nextDouble();
        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextDouble();
        System.out.print("Kimya Notunuz: ");
        kimya = input.nextDouble();
        System.out.print("Müzik Notunuz: ");
        muzik = input.nextDouble();


        if (mat >=0 && mat <=100){
            ortalama +=mat;
        }
        if (fizik >=0 && fizik <=100){
            ortalama +=fizik;
        }
        if (turkce >=0 && turkce <=100){
            ortalama +=turkce;
        }
        if (kimya >=0 && kimya <=100){
            ortalama +=kimya;
        }
        if (muzik >=0 && muzik <=100){
            ortalama +=muzik;
        }

        double avg = ortalama / 5;

        if (avg <=55){
            System.out.println("Sinifta kaldınız.");


        }
        else {
            System.out.println("Sınıfı geçtiniz. Tebrikler");

        }

    }
}
