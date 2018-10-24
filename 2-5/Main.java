package com.company;

public class Main {

    public static void main(String[] args) {
        int day=29;
        int month=2;
        int year=2016;
        boolean visok=false;
        if(year%4==0){
            visok=true;
        }
        if(month==4||month==6||month==9||month==11){
            if(day==30){
                day=1;
                month+=1;
            }
            else{
                day+=1;
            }
        }
        else if(month==2){
                if((day==28&!visok)||day==29){
                    day=1;
                    month+=1;
                }
                else{
                    day+=1;
                }
            }
            else if(month==12&day==31){
                day=1;
                month=1;
                year+=1;
                }
                else if(day==31){
                    day=1;
                    month+=1;
                    }
                    else{
                        day+=1;
                    }
        System.out.println(day+" "+month+" "+year);
    }
}


