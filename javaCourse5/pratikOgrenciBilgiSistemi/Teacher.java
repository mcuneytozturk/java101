package javaCourse5.pratikOgrenciBilgiSistemi;

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String branch, String mpno) {
        this.branch = branch;
        this.mpno = mpno;
        this.name = name;
    }

    void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Telefon numarası : " + this.mpno);
        System.out.println("Alanı : " + this.branch);
    }
}
