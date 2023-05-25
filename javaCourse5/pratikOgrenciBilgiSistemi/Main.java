package javaCourse5.pratikOgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Pekdemir", "TRH", "555");   
        Teacher t2 = new Teacher("Perihan hoca", "FZK", "666");   
        Teacher t3 = new Teacher("Cem Yılmaz", "BIO", "777");   
        
        Course tarih = new Course("Tarih", "Tarih101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "Fizik101", "FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji", "biyo101", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Erkek Öğrenci", "199", "1-A", tarih, fizik, biyo);

        s1.addNotes(100, 100, 80, 60, 50, 40);
        s1.isPass();
    }
}
