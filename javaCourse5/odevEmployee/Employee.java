package javaCourse5.odevEmployee;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double wage() {
        this.salary -= tax();
        this.salary += bonus();
        this.salary += raiseSalary();
        return this.salary;
    }

    double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    double raiseSalary() {
        hireYear = 2021 - this.hireYear;
        if (hireYear < 10) {
            return salary * 0.05;
        } else if (hireYear < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.20;
        }
    }

    @Override
    public String toString() {
        String result = "Adı: " + this.name + "\n";
        result += "Maaşı: " + this.salary + "\n";
        result += "Çalışma Saati: " + this.workHours + "\n";
        result += "Başlangıç Yılı: " + this.hireYear + "\n";
        result += "Vergi: " + tax() + "\n";
        result += "Bonus: " + bonus() + "\n";
        result += "Maaş Artışı: " + raiseSalary() + "\n";
        result += "Vergi ve bonuslar ile birlikte maaş: " + (this.salary - tax() + bonus()) + "\n";
        result += "Toplam maaş: " + wage() + "\n";

        return result;
    }

}
