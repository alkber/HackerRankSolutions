package com.alkber.hackerrank.algorithm.string.alternatingcharacters;

import java.util.Scanner;


public class Solution {


	public static void main(String arg[]) {

		String input[];
		Scanner inputScanner = (new Scanner(System.in));
		int     testCases    = Integer.valueOf(inputScanner.nextLine());
		input = new String[testCases];
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < testCases; i++) {

			input[i] = inputScanner.nextLine();
			sb.append(findCount(input[i])).append("\n");
		}

		System.out.println(sb.toString());
	}

	static int findCount(String input) {

		char []data = input.toCharArray();
		int opCnt = 0;

		for(int i = 0; i < data.length; i++) {

			char c = data[i];
			for (int j = i+1; j < data.length; j++) {

				if (data[j] == c) {

					opCnt++;
				} else {
					break;
				}
				i = j;
			}
		}
		return opCnt;
	}


}
