package com.company;

import java.util.Arrays;

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

    //Merge sort approach for inversionCount
    public static long mergeAndCount(long[] arr, int l, int m, int r)
    {

        // Left subarray
        long[] left = Arrays.copyOfRange(arr, l, m + 1);

        // Right subarray
        long[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l;
        long swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return swaps;
    }

    // Merge sort function
    public static long  mergeSortAndCountInversion(long[] arr, int l,int r)
    {

        //keep count
        long  count = 0;

        if (l < r) {
            int m = (l + r) / 2;

            // Total inversion count = left subarray count
            // + right subarray count + merge count

            // Left subarray count
            count += mergeSortAndCountInversion(arr, l, m); //

            // Right subarray count
            count += mergeSortAndCountInversion(arr, m + 1, r);

            // Merge count
            count += mergeAndCount(arr, l, m, r);
        }

        return count;
    }

}
