public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Emre", "53487415","MAT");
        Teacher t2 = new Teacher("Merve", "545214587", "FZK");
        Teacher t3 = new Teacher("Umay", "4514125485", "KMY");

        Course mat = new Course("Matematik", "MAT 101", "MAT");
        Course fizik = new Course("Fizik ", "FİZİK 101", "FZK");
        Course kimya = new Course("Kimya", "KİMYA1 01", "KMY");
        Course sMat = new Course("Matematik", "MAT101", "MAT");
        Course sFizik = new Course("Fizik", "FZK101", "FZK");
        Course sKimya = new Course("Kimya", "KMY101", "KMY");


        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek şaban",4,"1457484",mat,fizik,kimya,sMat,sFizik,sKimya);
        s1.addBulExamNote(50,20,40,50,65,32);
        s1.isPass();

        Student s2 = new Student("Güdük necmi",4,"748451",mat,fizik,kimya,sMat,sFizik,sKimya);
        s2.addBulExamNote(100,50,40,44,30,95);
        s2.isPass();

        Student s3 = new Student("Hayta ismail",4,"7458745",mat,fizik,kimya,sMat,sFizik,sKimya);
        s3.addBulExamNote(55,25,10,45,35,70);
        s3.isPass();

    }
}