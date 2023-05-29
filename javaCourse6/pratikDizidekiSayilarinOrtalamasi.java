package javaCourse6;

public class pratikDizidekiSayilarinOrtalamasi {
    public static void main(String[] args) {
        double[] arr = {1, 2, 3, 4, 5};

        double sum = 0;

        for(int i = 1; i <= arr.length; i++){
            sum += (1 / arr[i-1]);
        }
        
        System.out.println(sum);

    }
}
