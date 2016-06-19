package com.alkber.hackerrank.algorithm.string.pangrams;

import java.util.Scanner;


public class Solution {

	private final static int MAGIC_NUMBER = 26;

	public static void main(String arg[]) {

		Scanner inputScanner = (new Scanner(System.in));
		System.out.println(isPangrams(inputScanner.nextLine()) ? "pangram" : "not pangram");
	}

	private static boolean isPangrams(String ip) {

		char[] characterArray = ip.toLowerCase().toCharArray();
		int map[] = new int[26];
		int sum = 0;

		for(char current : characterArray) {

			int asciiCode = (int) current;
			if (asciiCode >= 97 && asciiCode <= 122) {

				if (map[122 - asciiCode] == 0) {

					sum += 1;
					map[122 - asciiCode] = 1;
				}
			}
		}
		return sum == MAGIC_NUMBER;
	}
}
