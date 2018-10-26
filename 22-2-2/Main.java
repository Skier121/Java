package com.company;

public class Main {

    public static void main(String[] args) {
        long n=123458754321L;
        boolean pal=false;
        byte b=0;
        byte i=0;
        byte[]arr=new byte[25];
        while(n>0){
            arr[b]=(byte)(n%10);
            n/=10;
            b++;
        }
        b--;
        while(i!=b/2&arr[i]==arr[b]){
            i++;
            b--;
        }
        if(i==b/2){
            pal=true;
        }
        System.out.println(pal);
    }
}


