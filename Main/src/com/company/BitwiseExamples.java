package com.company;

public class BitwiseExamples {
    public static int countSetBits(int n){
        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }

    public static void firstNNumbersWithExactlyTwoSetBits(int n, int p){

        for(int i=0; i<n; i++){
            int count = 0;
            int temp = i;
            while(temp != 0){
                temp = temp & (temp-1);
                count++;
            }
            if(count == 2 && p!=0){
                System.out.println(i);
                p--;
            }
        }
    }


}
