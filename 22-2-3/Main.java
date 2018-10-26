package com.company;

public class Main {

    public static void main(String[] args) {
        long n=558456845673213L;
        boolean ea=false;
        int i=2;
        if(n>0 & n<4){
            ea=true;
        }
        else {
            while (i<n & n%i!=0) {
                i++;
            }
        }
        if(i==n){
            ea=true;
        }
        System.out.println(ea);
    }
}


