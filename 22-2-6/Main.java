package com.company;
class MyException extends Exception{
    String out="Not correct number!";
}
public class Main {

    public static void main(String[] args) {
        int a = 444;
        int b = 1110;
        int i = 1;
        int res = 1;
        try {
            if (a < 1 || b < 1) {
                throw new MyException();
            }
            if (a == b) {
                res = a;
            } else {
                if (a > b) {
                    if (a % b == 0) {
                        res = b;
                    } else {
                        while (i < b) {
                            if (a % i == 0 & b % i == 0) {
                                res = i;
                                i++;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                else {
                    if (b % a == 0) {
                        res = a;
                    } else {
                        while (i < a) {
                            if (a % i == 0 & b % i == 0) {
                                res = i;
                                i++;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            System.out.println(res);
        } catch (MyException e) {
            System.out.println(e.out);
        }
    }
}


