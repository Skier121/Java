package com.company;

public class Main {

    public static void main(String[] args) {
        int a=444;
        int b=1110;
        int res=1;
        int i=1;
        if(a%b==0){
            res=b;
        }
        else if(b%a==0){
            res=a;
        }
        else{
            while(i<a&i<b){
                if(a%i==0&b%i==0){
                    res=i;
                }
                i++;
            }
        }
        System.out.println(res);
    }
}


