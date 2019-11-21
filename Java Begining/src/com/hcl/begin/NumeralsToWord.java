package com.hcl.begin;
import java.util.Scanner;
public class NumeralsToWord {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n, d1, d2;
		String Str1[] = {"","", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
				"Eighty", "Ninety"};
		String Str2[] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			     "Nine", "Ten", "Eleven", "Twelve", "Thieteen", "Fourteen", "Fifteen",
			     "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		System.out.println("Enter any No between 1 to 99");
		n=in.nextInt();
		if((n<=1)||(n>=100)) {
			System.out.println("Wrong!!");
		}
		else if((n>=1)&&(n<=19)) {
			System.out.println(Str2[n]);
		}
		else if((n>=20)&&(n<=99)) {
			d1 = n/10;
			d2 = n%10;
			System.out.println(Str1[d1]+" "+Str2[d2]);
		}
	}
}