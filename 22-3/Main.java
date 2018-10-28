package com.company;


import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int number=1;
		int i=1;
		int sum=0;
		boolean res=false;
		while(i!=number){
			if(number%i==0){
				sum+=i;
			}
			i++;
		}
		if(sum==number){
			res=true;
		}
		System.out.println(res);
	}

}
