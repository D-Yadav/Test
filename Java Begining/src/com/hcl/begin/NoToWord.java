package com.hcl.begin;

public class NoToWord {
	public static void main(String[] args)
	{
		String s1[]={ " one"," two"," three"," four"," five"," six"," seven"," eight", " nine", " ten", " eleven", " twelve",
				" thirteen", " fourteen", " fifteen", " sixteen",
				" seventeen", " eighteen", " nineteen"};
		String[] s2= {" ten"," twenty"," thirty"," forty"," fifty"," sixty"," seventy",
				" eighty"," ninety"};
		String[] s3={" Hundred"," Thousand"};
		int i=1236;
		while(i>0)
		{
			if(i>=1&&i<=19)
			{
				System.out.println(s1[i-1]);
				break;
			}
			else if(i>=20&&i<=99)
			{
				int l=i%10;
				i=i-l;
				i=i/10;
				System.out.println(s2[i-1]+""+s1[l-1]);
				break;
			}
			else if(i>=100&&i<=999)
			{
				int l=i%100;
				int k=i-l;
				k=k/100;
				System.out.print(s1[k-1]+""+"hundred");
				i=i-(k*100);
			}
			else if(i>=1000&&i<=9999){
				int l=i%1000;
				int k=i-l;
				k=k/1000;
				System.out.print(s1[k-1] +""+"thousand");
				i=i-(k*1000);
			}
		}
	}
}

