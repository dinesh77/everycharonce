//Req: Write a program to print every character only once

package com.javalaya.strings.practice;

class String_Pro8{
	
	public static void m(String s){
		String res = "";
		for(int i=0;i<s.length();i++){
			if(!res.contains(String.valueOf(s.charAt(i)))){
				res = res.concat(String.valueOf(s.charAt(i)));
			}
		}
		System.out.println(res);
	}
}

class String_Pro8_Test{
	
	public static void main(String...abc){
		System.out.println("\n\n/*************** OUTPUT ***************\n");
		String_Pro8.m("Javalaya students");
		System.out.println("\n*************** EXECUTION COMPLETED *****************/");
	}
}

/*************** OUTPUT ***************

Javly studen

*************** EXECUTION COMPLETED *****************/
