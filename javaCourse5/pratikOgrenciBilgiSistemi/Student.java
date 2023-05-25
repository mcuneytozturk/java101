package javaCourse5.pratikOgrenciBilgiSistemi;

import java.nio.charset.CodingErrorAction;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String className;
    double avg;
    boolean isPass;

    Student(String name,
            String stuNo,
            String className, 
            Course c1, 
            Course c2, 
            Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.className = className;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avg = 0.0;
        this.isPass = false;
    }
   
    void addNotes(int n1, int vn1, int n2, int vn2, int n3, int vn3){
        if(n1 <= 100 && n1 >= 0 && vn1 <= 100 && vn1 >= 0){
            c1.note = n1 * 0.80 + vn1 * 0.20;
        }
        if(n2 <= 100 && n2 >= 0 && vn2 <= 100 && vn2 >= 0){
            c2.note = n2 * 0.70 + vn2 * 0.30;
        }
        if(n3 <= 100 && n3 >= 0 && vn3 <= 100 && vn3 >= 0){
            c3.note = n3 * 0.750 + vn3 * 0.25;
        }
    }
    void isPass(){
        this.avg = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if(this.avg > 55) {
            System.out.println("\nÖğrenci Sınıfı Geçti\n");
            isPass = true;
        } else {
            System.out.println("Öğrenci Sınıfta Kaldı\n");
            isPass = false;
        }
        printNotes();
    }

    void printNotes(){
        System.out.println(c1.name + " dersi için %80 sınav %20 sözlü değer alınarak alınmış ortalama notu\t: " + c1.note);
        System.out.println(c2.name + " dersi için %70 sınav %30 sözlü değer alınarak alınmış ortalama notu\t: " + c2.note);
        System.out.println(c3.name + " dersi için %75 sınav %25 sözlü değer alınarak alınmış ortalama notu\t: " + c3.note);

        System.out.println("\nÖğrencimizin not ortalaması: \t " + this.avg + "\n");
    }

}
