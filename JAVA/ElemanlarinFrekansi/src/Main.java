import java.util.Arrays;

public class Main {
    static boolean sorgu(int[] array, int value, int c) {
        for (int i = 0; i < c; i++) {
            if (value == array[i]) {
                return false;
            }
        }
        return true;

    }

    static int hesap (int[] array, int value) {
        int sayac = 0;
        for(int i : array) {
            if (i == value) {
                sayac++;
            }
        }
        return sayac;
    }

    public static void main(String[] args) {
        int[] array = {10,20,20,10,10,20,5,20};
        System.out.println("Dizi : " + Arrays.toString(array));
        System.out.println("Tekrar sayıları : ");
        for (int i = 0; i < array.length; i++) {
            if (sorgu(array,array[i],i)) {
                System.out.println(array[i] +" Sayısı " + hesap(array,array[i]) + " Kez tekrar edildi");
            }
        }
    }
}