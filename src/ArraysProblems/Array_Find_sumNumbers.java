package ArraysProblems;//Given an array A[] and a number x, check
//for pair in A[] with sum as x

import java.util.HashMap;

public class Array_Find_sumNumbers {

    public static void main(String[] args) {
    Array_Find_sumNumbers.findUsingHashMap();
    }

    //log(n^2) very bad algorithm
    public static void gettingTheNumbers(){
        int [] arr = {2,3,4,1,5,3,0}; //find the sum of 5
        int sum =5;
        for(int i=0 ; i<arr.length ; i++){
            for(int j =i+1; j < arr.length ; j++){
                // System.out.println(" /////i = "+i+"  ; j = "+j);
                if(arr[i] + arr[j] == sum){
                    System.out.print( "i =  "+arr[i]);
                    System.out.print( " ; j =  "+arr[j]);
                }
            }
            System.out.println("********************");
        }
    }


    //works only if duplicate is not present//pretty good
    public static void findUsingHashMap(){
        HashMap<Integer,Integer >  arrayMap = new HashMap<>();
        int [] arr = {2,3,4,1,5,0}; //find the sum of 5
        int sum =5;
        for(int i=0; i<arr.length ; i++){
           arrayMap.putIfAbsent(arr[i],i);
//          if( arrayMap.get(arr[i]) == null ){
//              arrayMap.put(arr[i],i);
//          }
          if( arrayMap.get(sum - arr[i]) != null){
              System.out.println("Map :  "+arr[i]+" , "+(sum - arr[i]));
          }
        }

        //use merge sort
    }

    public static void withSortAlgorithm(){

    }

}
