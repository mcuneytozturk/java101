package javaCourse5.pratikOgrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double note;
    int verbalnote;
    
    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int verbalNote = 0;
    };

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            printTeacher();
        } else {
            System.out.println("Ders ve öğretmen bölümleri uyuşmuyor.");
        }
    };

    void printTeacher(){
        this.teacher.print();
    }
}

