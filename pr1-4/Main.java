package com.company;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		//переделал на занятии с for на while
		String number="9643";
		char[] arr=number.toCharArray();
		int i=1;
		while(arr[i]>arr[i-1]&i<4){
			i++;
		}
		int j=1;
		while(arr[i]<arr[i-1]&j<4){
			j++;
		}
		if(i==4||j==4){
			System.out.println("stairway");
		}
		else{
			System.out.println("no stairway");
		}
	}
}

