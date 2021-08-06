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


}
