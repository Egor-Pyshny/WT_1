package task4;

import java.util.*;

public class FindPrimes {

    public static ArrayList<Integer> findPrimes(int[] arr){
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(isPrime(arr[i])){
                indexes.add(i);
            }
        }
        System.out.println(indexes);
        return indexes;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;

        if (n % 2 == 0) return false;
        for (int i = 2; i <= Math.sqrt(n)+1; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
