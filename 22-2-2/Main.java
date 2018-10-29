package com.company;

public class Main {

    public static void main(String[] args) {
        long number=12345844321L;
        long rebmun=0;
        long temp=number;
        int n=0;
        while(number>0) {
            number /= 10;
            n++;
        }
        number=temp;
        while(n>0){
            rebmun+=number%10*Math.pow(10,n);
            number/=10;
            n--;

        }
        System.out.println(number==rebmun);
    }
}


