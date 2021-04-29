package section_5.largest_prime;

import java.util.ArrayList;
import java.util.List;

public class LargestPrime {
    public static int getLargestPrime(int number){
        if (number< 2){
            return -1;
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= number ; i++) {
            int flag =0;
            for (int j = i; j >= 1 ; j--) {
                if (i % j == 0){
                    flag++;
                }
            }

            if (flag == 2){
                primes.add(i);
            }
        }
        int largestPrime = -1;
        for (int i = primes.size()-1; i >= 0 ; i--) {
            if (number % primes.get(i)==0){
                largestPrime = primes.get(i);
                break;
            }
        }
        return largestPrime;
    }
}
