import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int satirNumarasi;
    int sutunNumarasi;
    String [][] mayinMap;
    String [][] oyunMap;
    int mayinNumarasi;


    MineSweeper(int satirNumarasi, int sutunNumarasi) {
        this.satirNumarasi = satirNumarasi;
        this.sutunNumarasi = sutunNumarasi;
        this.mayinMap = new String [satirNumarasi][sutunNumarasi];
        this.oyunMap = new String [satirNumarasi][sutunNumarasi];
        this.mayinNumarasi = (satirNumarasi * sutunNumarasi) / 4;
    }

    void printMap(){
        for(int i = 0; i < satirNumarasi; i++){
            for(int j = 0; j < sutunNumarasi; j++){
                System.out.print(this.oyunMap[i][j] +  " ");
            }
            System.out.println();
        }
    }

    void oyunMap(){
        for (int i = 0; i < satirNumarasi; i++) {
            for (int j = 0; j < sutunNumarasi; j++) {
                this.oyunMap[i][j] = "-";
            }
        }
    }

    public void mayinUret() {
        Random rand = new Random();
        for(int i = 0; i < mayinNumarasi; i++){
            int randomSatir = rand.nextInt(satirNumarasi);
            int randomSutun = rand.nextInt(sutunNumarasi);

            if(!Objects.equals(this.mayinMap[randomSatir][randomSutun], "*")) {
                this.mayinMap[randomSatir][randomSutun] = "*";
            }else {
                i--;
            }
        }

        for(int i = 0; i < satirNumarasi; i++){
            for(int j = 0; j < sutunNumarasi; j++){
                if(!Objects.equals(this.mayinMap[i][j], "*")){
                    this.mayinMap[i][j] = "-";
                }
                System.out.print(this.mayinMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    void bosMayinMap(){
        for(int i = 0; i < satirNumarasi; i++){
            for(int j = 0; j < sutunNumarasi; j++){
                System.out.print(this.mayinMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    void run(){
        int toplamHareket = (satirNumarasi * sutunNumarasi) - mayinNumarasi;
        Scanner input = new Scanner(System.in);

        oyunMap();
        System.out.println("Mayınların Konumu");
        mayinUret();
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz");

        while(toplamHareket > 0) {
            int mayinSayac = 0;

            System.out.println("===========================");
            System.out.println("Kalan Hamle Hakkınız : " + toplamHareket);
            printMap();

            System.out.print("Satır Giriniz : ");
            int satir = input.nextInt();

            System.out.print("Sütun Giriniz : ");
            int sutun = input.nextInt();


            if ((satir < 0 || satir >= satirNumarasi) || (sutun < 0 || sutun >= sutunNumarasi)) {
                System.out.println("Hatalı Giriş Yaptınız, Lütfen map alanı içerisinde bir değer giriniz");
                continue;
            } else {
                if (this.mayinMap[satir][sutun].equals("*")) {
                    System.out.println("Game Over !");
                    bosMayinMap();
                    break;
                }if( ! this.oyunMap[satir][sutun].equals("-") ){
                    System.out.println("Bu hamleyi zaten yaptınız !");
                    continue;
                }else{
                    int eksiSatir = (satir - 1), artiSatir = (satir + 1);
                    int eksiSutun = (sutun - 1), artiSutun = (sutun + 1);

                    if ( (eksiSatir < 0) || (eksiSutun < 0) ){
                        eksiSatir = 0;
                        eksiSutun = 0;
                    }
                    if( (artiSatir >= satirNumarasi) || (artiSutun >= sutunNumarasi) ){
                        artiSatir = satir;
                        artiSutun = sutun;
                    }
                    for(int i = eksiSatir; i <= artiSatir; i++){
                        for (int j = eksiSutun; j<= artiSutun; j++){
                            if(this.mayinMap[i][j].equals("*")){
                                mayinSayac++;
                            }
                        }
                    }
                    String mayinSayaciDonustur = String.valueOf(mayinSayac);
                    this.oyunMap[satir][sutun] = mayinSayaciDonustur;
                    toplamHareket--;
                }
            }
        }
        if(toplamHareket == 0){
            System.out.println("Oyunu Kazandınız  !");
            printMap();
        }
    }
}