package com.multiply;
import java.util.*;

public class Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
	int	number=sc.nextInt();
	String numbers="";
	for(int i=2;i>number;i++) {
		if(number%i!=0) {
			numbers="prime";
			
			
		}
	}
     System.out.println(numbers);
	}

}
