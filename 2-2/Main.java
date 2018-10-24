package com.company;

public class Main {

    public static void main(String[] args) {
        int age=4;
        int answer1=3;
        int answer2=0;
        if(age>300){
            answer1+=age-300+800;
        }
        else if(age>200){
            answer1+=(age-200)*2+600;
        }
        else{
            answer1+=age*3;
        }
        answer2=answer1*2;
        System.out.println("dragon has "+answer1+" heads and "+answer2+" eyes");
    }
}


