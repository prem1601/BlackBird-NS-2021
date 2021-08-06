package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
//        ArrayList<Integer> list = PrimeNumbers.sieve(n);
//
//        for(int i=0; i<list.size(); i++)
//            System.out.print(list.get(i) + " ");


//        int whoWon = Assignments.dragonSlayer(8, 2, 5, 2);
//
//        if(whoWon==0){
//            System.out.println("Dragon Won");
//        }else{
//            System.out.println("Natsu Won");
//        }

        System.out.println(Assignments.inversionCount(arr));
    }




}
