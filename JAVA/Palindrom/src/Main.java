import java.util.Scanner;

public class Main {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastnumber;
        while (temp !=0){
            lastnumber = temp % 10;
            reverseNumber = (reverseNumber *10) + lastnumber;
            temp /= 10;
        }
        if (number == reverseNumber){
            System.out.print(number+ " Polindrom bir sayıdır.");
            return true;
        }
        else{
            System.out.print(number+ " Polindrom sayı değildir.");
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = inp.nextInt();
        isPalindrom(number);

    }
}