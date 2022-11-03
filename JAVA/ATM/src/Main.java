import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1000, toplam = 0, q = 3, a;
        while (q > 0) {
            System.out.print("Kullanıcı adı giriniz: ");
            String t = scanner.nextLine();
            System.out.print("Şifre giriniz: ");
            String k = scanner.nextLine();

            if (t.equals("emreser") && k.equals("0520")) {
                System.out.print("Eser bankasına hoşgeldiniz.\n");
                do {
                    System.out.print("\n1-Para yatırma için  " +
                            "\n2-Para çekmek için" +
                            "\n3-Bakiye sorgulama için" +
                            "\n4-Çıkış\n");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    a = scanner.nextInt();

                    switch (a) {
                        case 1:
                            System.out.print("Para miktarı: ");
                            int j = scanner.nextInt();
                            i += j;
                            System.out.println("Bakiyeniz " + i);
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutar: ");
                            int l = scanner.nextInt();
                            if (l > i) {
                                System.out.println("Yetersiz bakiye\n");
                                break;
                            } else {
                                i -= l;
                                System.out.println("Bakiyeniz: " + i);
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut Bakiyeniz: " + i);
                            break;
                        case 4:
                            System.out.print("İyi günler. Yine bekleriz...");
                            break;
                    }
                }while (a !=4);
                break;

            } else {
                q--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz tekrar deneyiniz.");
                if (q == 0) {
                    System.out.print("Hesabınız bloke oldu. Bankayla iletişime geçiniz.");
                } else {
                    System.out.println("Kalan hakkınız : " + q);
                }

            }
        }
    }
}