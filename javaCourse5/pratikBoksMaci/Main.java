package javaCourse5.pratikBoksMaci;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Mike Tyson", 20, 100, 110, 8, 56);
        Fighter f2 = new Fighter("Muhammed Ali", 30, 100, 120, 10, 54);

        Match match = new Match(f1, f2, 90, 120);

        match.run();

    }
}
