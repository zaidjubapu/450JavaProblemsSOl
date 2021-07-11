package com.company.java450dsa;

public class A03KthsmallEle {

    

    public static void main(String [] args){
        int arr[]= {12,3,5,7,4,19,26};
        int n = arr.length,k=3;
        System.out.println("k'th smallest Element is " + kthSmallest(arr,0,n-1,k));
    }

}
