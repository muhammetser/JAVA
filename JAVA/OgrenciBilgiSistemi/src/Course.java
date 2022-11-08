public class Course {
    Teacher CourseTeacher;
    String name;
    String Code;
    String prefix;
    int note;
    int sNote;


    public Course(String name, String Code, String prefix) {
        this.name = name;
        this.Code = Code;
        this.prefix = prefix;
        this.note = 0;
        this.sNote = 0;

    }
    public void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)) {
            this.CourseTeacher = t;
            System.out.println("İşlem başarılı.");
        }
        else {
            System.out.println(t.name + "Hoca bu dersi veremez.");
        }
    }


    public void printTeacher() {
        if (CourseTeacher !=null) {
            System.out.println(this.name + "dersinin hocası : " + CourseTeacher);
        }
        else {
            System.out.println(this.name + "dersine hoca atanmamıştır");
        }
    }
}

