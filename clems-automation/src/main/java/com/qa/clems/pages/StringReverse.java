package com.qa.clems.pages;

public class StringReverse {

	public static void main(String[] args) {
// string manipulation
//		String str = "Selenium";
//		String rev = "";
//		int l = str.length();
//		for (int i = l - 1; i >= 0; i--) {
//			rev = rev + str.charAt(i);
//		}
//		System.out.println(rev);
//		// String buffer class
//		StringBuffer sf = new StringBuffer(str);
//	 System.out.println(sf.reverse());

		// How to swap two strings
		String a = "hello";
		String b = "world";
		// before swaping
//		System.out.println("Before Swappinh , String a is: " + a + " And String B is : " + b);
//		String temp = null;
//		temp = a;
//		a = b;
//		b = temp;
//		System.out.println("After Swappinh , String a is: " + a + "And String B is : " + b);
// append and using substring
		a =a+b;
		b = a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("After Swappinh , String a is: " + a + " And String B is : " + b);

	}
}
