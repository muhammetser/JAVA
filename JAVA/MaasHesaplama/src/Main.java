public class Main {
    public static void main(String[] args) {
        Employee calisan1 = new Employee("Emre Eser",40,2021,1000);
        Employee calisan2 = new Employee("Samet Eser ",50,2015,8000);


        calisan1.tax();
        calisan2.tax();

        calisan1.bonus();
        calisan2.bonus();

        calisan1.raiseSalary();
        calisan2.raiseSalary();

        calisan1.toPrint();
        calisan2.toPrint();
    }
}