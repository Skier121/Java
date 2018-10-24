package com.company;

public class Main {

    public static void main(String[] args) {
        String ch="n";
        boolean answer=false;
        char c=ch.toLowerCase().charAt(0);
        if(c==97||c==101||c==105||c==111||c==117){
            answer=true;
        }
        System.out.println(answer);
    }
}


