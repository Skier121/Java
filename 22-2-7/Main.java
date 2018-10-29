package com.company;

public class Main {

    public static void main(String[] args) {
        long number=1234567890L;
        long temp=0;
        int count=0;
        for(int i=0;i<10;i++){
            temp=number;
            while(temp>0) {
                if (temp % 10 == i) {
                    count++;
                    break;
                } else {
                    temp /= 10;
                }
            }
        }
        System.out.println(count);
    }
}


