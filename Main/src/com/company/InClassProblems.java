package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class InClassProblems {
    public static void arrayList(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(30);
        list.add(34);
        list.add(55);
        list.add(90);
        list.add(37);

//        int res=0;
//        for(int i=0; i<list.size(); i++){
//            res += list.get(i);
//            System.out.print(res + " ");
//        }
//
//        System.out.println("\nFinal sum is : " + res);


        //Before sorting
        System.out.println(list);

        //Sorted with collection syntax
        Collections.sort(list);
        System.out.println(list);

        //Sorted in reverse
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);


    }



}
