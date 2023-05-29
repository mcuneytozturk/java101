package javaCourse6;

public class pratikdeneme {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 6, 8, 4, 6, 2, 10, 8, 12, 10};

        System.out.println("Tekrar Eden Çift Sayılar ve Frekansları:");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) { // Sadece çift sayıları kontrol ediyoruz
                int frequency = 0;
                for (int j = 0; j < numbers.length; j++) {
                    if (i != j && numbers[i] == numbers[j]) {
                        frequency++;
                    }
                }
                if (frequency > 0) {
                    System.out.println(numbers[i] + " - Frekans: " + frequency);
                }
            }
        }
    }
}
