package com.company;

public class Main {

    public static void main(String[] args) {
        long n=5584568456L;
        long i=1;
        while(!(i>n)){
            if(n%i==0){
                System.out.println(i);
            }
            i++;
        }
    }
}


