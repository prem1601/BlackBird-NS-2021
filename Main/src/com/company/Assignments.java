package com.company;

public class Assignments {

    public static int dragonSlayer(int a, int b, int c, int d){
        //  {8 2   5 3}
        if(a<0)
            return 1;

        if(c<0)
            return 0;

        return dragonSlayer(a-d, b, c-b, d);
    }

    public static int inversionCount(int[] arr){
        int count=0;

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    count++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return count;
    }

}
