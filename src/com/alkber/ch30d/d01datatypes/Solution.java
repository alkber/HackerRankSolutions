package com.alkber.ch30d.d01datatypes;

import java.util.Scanner;


public class Solution {


	public static void main(String arg[]) {

		Scanner inputScanner = (new Scanner(System.in));
		int i = 4 + Integer.valueOf(inputScanner.nextLine());
		double d = 4.0 + Double.valueOf(inputScanner.nextLine()) ;
		String s = "HackerRank " + inputScanner.nextLine();


		System.out.println( i);
		System.out.println( d);
		System.out.println( s);

	}

}
