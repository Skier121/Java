package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        int number=964367;
        double temp=1;
        double temp1=0;
        for(int i=6;i>0;i--){
            temp*=number%10;
            temp1+=number%10;
            number/=10;
        }
        System.out.println("Геометрическое среднее равно "+(Math.pow(temp,(1.0/6.0))));
        System.out.println("Арифметическое среднее равно "+(temp1/6));
    }
}
