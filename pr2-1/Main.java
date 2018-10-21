package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        int ax=5;
        int ay=65;
        int bx=4;
        int by=43;
        int cx=2;
        int cy=68;
        double ab=Math.sqrt(Math.pow((ax-bx),2)+Math.pow((ay-by),2));
        double ac=Math.sqrt(Math.pow((ax-cx),2)+Math.pow((ay-cy),2));
        double bc=Math.sqrt(Math.pow((bx-cx),2)+Math.pow((by-cy),2));
        if(ab<(ac+bc)&bc<(ab+ac)&ac<(ab+bc)) {
            if (Math.pow(ab, 2) == Math.pow(bc, 2) + Math.pow(ac, 2) || Math.pow(bc, 2) == Math.pow(ab, 2) + Math.pow(ac, 2) ||
                    Math.pow(ac, 2) == Math.pow(bc, 2) + Math.pow(ab, 2)) {
                System.out.println("right triangle");
            }
            System.out.println("rectangle");
        }
        else{
            System.out.println("not rectangle");
        }
    }
}
