package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        int number=9643671;
        String res="";
        while(number!=0){
            res+=number%10;
            number/=10;
        }
        System.out.println(res);
    }
}
