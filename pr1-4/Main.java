package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        String number="9643";
        char[] arr=number.toCharArray();
        boolean res1=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                res1=false;
                break;
            }
        }
        boolean res2=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                res2=false;
                break;
            }
        }
        if(res1||res2){
            System.out.println("stairway");
        }
        else{
            System.out.println("no stairway");
        }
    }
}
