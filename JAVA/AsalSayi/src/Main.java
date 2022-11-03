public class Main {
    public static void main(String[] args){
        int i,adet,j;
        String sayi = "";

        for (i=1;i<100;i++){
            adet = 0;
            for (j=i;j>=1;j--){
                if(i%j==0){
                    adet++;
                }


            }
            if(adet ==2){
                sayi +=  i + " ";
            }
        }
        System.out.println(sayi);


    }
}