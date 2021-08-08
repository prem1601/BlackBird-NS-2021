package com.company;

public class MockDSA {
    public static void sortingQuestions(int[] arr){
//        //{8, 2, 7, 3, 5, 4, 6, 1, 9}
//        //Answer is to show pairs (8-2, 7-3, 6-4)
//        for(int i=0; i<arr.length; i++){
//            for(int j=1; j<arr.length-1; j++){
//                if((arr[i]+arr[j])==10){
//                    System.out.println(arr[i] + " " + arr[j]);
//                }
//            }
//        }



        //{ 6, 0, 8, 2, 3, 0, 4, 0, 1 }
        //Answer must like {1, 2, 3, 4, 6, 8, 0, 0, 0}
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr.length-1; j++){
                if(arr[i]!=0){
                    if(arr[i]<arr[j]){
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
