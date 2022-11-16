import java.util.Arrays;

public class Main {
    static boolean isFind(int[] duplicate, int value) {
        for ( int i : duplicate) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {2,3,1,4,7,9,7,9,8,4,8,12,48,32,32,65,62,48,10,20,10,20};
        int[] duplicate = new int[list.length];
        int startindex = 0;


        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if((i!=j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (!isFind(duplicate,list[i])) {
                        duplicate[startindex++] = list[i];

                    }
                    break;
                }
            }
        }

        for (int value : duplicate) {
            if (value !=0) {
                System.out.print(value + ",");
            }
        }
    }
}