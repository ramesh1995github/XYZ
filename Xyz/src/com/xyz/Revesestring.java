package com.xyz;

public class Revesestring {

	public static void main(String[] args) {
		String str="madam";
		String revstr="";
		for(int i=str.length()-1;i>=0;i--) {
			revstr=revstr+str.charAt(i);
			
		}
		System.out.println("original string "+str);
		System.out.println("reverse string "+revstr);

	}

}
