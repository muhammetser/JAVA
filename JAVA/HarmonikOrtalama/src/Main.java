public class Main {
    public static void main(String[] args) {
        int numbers [] = {1, 2, 3, 4, 5,};
        double sum=0;
        for(int i : numbers) {
            sum += (1.0 / i );
        }

        double harmonicOrtalama = numbers.length / sum;
        System.out.println("Harmonik Ortalama = " + harmonicOrtalama);
    }
}