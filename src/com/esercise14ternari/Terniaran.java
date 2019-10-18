package com.esercise14ternari;

import java.util.Scanner;

public class Terniaran {

	public static void main(String[] args)
	{
		int num=0;
		Scanner input = new Scanner(System.in);
		String msg="";
		
		System.out.println("give a number");
		num = input.nextInt();  
		
		// Evaluacion ? true false
		System.out.println(num>5?"grater":" lower");
		msg = (num>5)?"number greater than 5": " number lower than 5";
		//num==5?
		

	}

}
