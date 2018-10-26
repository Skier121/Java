package com.company;

public class Main {

    public static void main(String[] args) {
        int N=1000;
        int rib=0;
        int face=0;
        int tail=0;
        for(int i=0;i<N;i++){
            int t=((int)(Math.random()*2.05));
            switch(t){
                case 2:
                    rib+=1;
                    break;
                case 1:
                    face+=1;
                    break;
                case 0:
                    tail+=1;
            }
        }
        System.out.println("ribs: "+rib);
        System.out.println("faces: "+face);
        System.out.println("tails: "+tail);
    }
}


