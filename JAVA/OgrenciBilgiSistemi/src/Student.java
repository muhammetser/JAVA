import java.awt.color.ICC_ColorSpace;

public class Student {
    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course sMat;
    Course sFizik;
    Course sKimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya, Course sMat, Course sFizik, Course sKimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.sMat = sMat;
        this.sFizik = sFizik;
        this.sKimya = sKimya;
        calcAvarage();
        this.isPass = false;
    }


   public void addBulExamNote(int mat, int fizik, int kimya, int sMat, int sFizik, int sKimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
       if (sMat >= 0 && sMat <= 100) {
           this.sMat.note = sMat;
       }
       if (sFizik >= 0 && sFizik <= 100) {
           this.sFizik.note = sFizik;
       }
       if (sKimya >= 0 && sKimya <= 100) {
           this.sKimya.note = sKimya;
       }


    }
  public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş.");
        }
        else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı geçti. ");
            }
            else {
                System.out.println("Sınıfta kaldı");
            }
        }
    }

   public void calcAvarage() {
        this.avarage = ((this.fizik.note * 0.8 + this.sFizik.note * 0.2) + (this.kimya.note * 0.8 + this.sKimya.note * 0.2) + (this.mat.note * 0.8 + this.sMat.note * 0.2)) /3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return  this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=======================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + this.sMat.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu : " + this.sKimya.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + this.sFizik.note);


    }

}
