public class Employee {
    String name;
    int salary;
    double tax;
    double raise;
    int workHours;
    int hireYear;
    int bonus;
    int howYear;
    int year = 2021;

    Employee(String name, int workHours, int hireYear, int salary) {
        this.name = name;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.salary = salary;
    }

    void tax() {
        if (salary > 1000)
            tax = this.salary * 0.03;

         else {
             tax = 0;
        }
    }

    void bonus() {
        if (workHours > 40)
            bonus = (workHours - 40) *30;

        else {
            bonus = 0;
        }
    }

    void raiseSalary() {
        howYear = year - hireYear;
        if (howYear < 10)
            raise = this.salary * 0.5;

        else if (howYear > 9 && howYear < 20) {
            raise = this.salary * 0.10;
        }
        else if (howYear > 19 ) {
            raise = this.salary * 0.15;
        }
    }

    void toPrint() {
        System.out.println("Çalışanın Adı : " + this.name);
        System.out.println("Çalışanın Haftalık Çalışma Saati : " + this.workHours);
        System.out.println("Çalışanın İşe Başlangıç Yılı : " + this.hireYear);
        System.out.println("Çalışanın Maaşı : " + this.salary +" TL");
        System.out.println("Maaş'a Uygulanan Vergi : " + this.tax);
        System.out.println("Mesai Ücreti : " + this.bonus + " TL");
        System.out.println("Yıllık Zammı : " + this.raise + " TL");
        System.out.println("Toplam Maaş : "+ (salary+bonus+raise-tax) + " TL");
        System.out.println("-------------------------------------------------------------");

    }
}
