import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String UserName,PassWord;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz : ");
        UserName = inp.nextLine();

        System.out.print("Şifrenizi Giriniz : ");
        PassWord = inp.nextLine();

        if (UserName.equals("Emre") && (PassWord.equals("1234"))) {
            System.out.println("Giriş başarılı.");


        }
        else {
            System.out.println("Giriş başarısız ! ");

            String pssWrd2;
            int select;

            System.out.println("Şifrenizi değiştirmek için 1'e basın, çıkmak için 2'ye basın. ");
            select = inp.nextInt();

            switch (select){
                case 1:
                    System.out.print("Yeni şifrenizi girin : ");
                    Scanner inp2 = new Scanner(System.in);
                    pssWrd2 = inp2.nextLine();
                    if (pssWrd2.equals("1234")){
                        System.out.print("Yeni şifre eski şifre ile aynı olamaz.");

                    }
                    else {
                        System.out.print("Şifreniz başarıyla değiştirildi.");

                    }
                    break;
                case 2:
                    System.out.println("Başarıyla çıkış yapıldı.");
                    break;
        }
        }
    }
}