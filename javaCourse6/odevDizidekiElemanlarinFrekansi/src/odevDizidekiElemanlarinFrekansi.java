package javaCourse6.odevDizidekiElemanlarinFrekansi.src;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class odevDizidekiElemanlarinFrekansi {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int n = Scanner.nextInt();

        int[] arr = new int[n];
        int temp = 1;

        while (temp < n + 1){
            System.out.println(temp + ". Elemanı : ");
            arr[temp - 1] = Scanner.nextInt();
            temp++;
        }

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Calculate the frequencies
        for (int number : arr) {
            if (frequencyMap.containsKey(number)) {
                // If the number is already in the map, increment its frequency
                frequencyMap.put(number, frequencyMap.get(number) + 1);
            } else {
                // If the number is not in the map, add it with a frequency of 1
                frequencyMap.put(number, 1);
            }
        }

        // Print the frequencies
        for (int number : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(number);
            System.out.println(number + " occurs " + frequency + " times");
        }

    }
}
