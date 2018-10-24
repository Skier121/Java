package com.company;

public class Main {

    public static void main(String[] args) {
        char ch='j';
        boolean answer=false;
        char[]arr={'A','E','I','O','U','a','e','i','o','u'};
        for(char chc:arr) {
            if (chc == ch) {
                answer = true;
                break;
            }
        }
        System.out.println(answer);
    }
}


