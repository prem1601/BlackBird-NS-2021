package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumbers {
    public static ArrayList<Integer> sieve(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i=2; i<=n; i++){
            if(isPrime[i]){
                for(int j=i; j*i<=n; j++){
                    isPrime[j*i] = false;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<=n; i++){
            if(isPrime[i])
                list.add(i);
        }

        return list;
    }
}
