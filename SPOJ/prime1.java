//PRIME1

import java.io.*;
import java.util.*;
import java.math.*;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int[] primes = new int[4000];
        int numprimes = 0;
    
        primes[numprimes++] = 2;
        for (int i = 3; i <= 32000; i+=2)
        {
              boolean isprime = true;
               double cap = Math.sqrt(i) + 1.0;
               for (int j = 0; j < numprimes; j++) 
            {
                if (j >= cap) 
                    break;
                   if (i % primes[j] == 0) 
                {
                       isprime = false;
                    break;
                }
            }
            if (isprime) primes[numprimes++] = i;
        }


         int T,N,M;
        T = in.nextInt();
    
        for (int t = 0; t < T; t++) 
        {
            if (t > 0) 
                System.out.println("");

            M = in.nextInt();
            N = in.nextInt();

            if (M < 2) 
                M = 2;

            boolean[] isprime = new boolean[100001];
            for (int j = 0; j < 100001; j++)
            {
                        isprime[j] = true;
            }

            for (int i = 0; i < numprimes; i++) 
            {
                int p = primes[i];
                int start;

                if (p >= M) start = p*2;
                else start = M + ((p - M % p)%p);

                for (int j = start; j <= N; j += p) 
                {
                       isprime[j - M] = false;
                }
            }

            for (int i = M; i <= N; i++) 
            {
                if (isprime[i-M]) System.out.println(i);
             }
        }
    }
}
