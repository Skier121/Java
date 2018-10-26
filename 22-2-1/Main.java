package com.company;

public class Main {

    public static void main(String[] args) {
        long n=3447583565424768545L;
        byte biggest=(byte)(n%10);
        while(n>0){
            n/=10;
            if(n%10>biggest){
                biggest=(byte)(n%10);
            }
        }
        System.out.println(biggest);
    }
}


