package org.execution;

public class StringMethod {
	private void string1() {
		String s="Java program";
		String[] split = s.split(" ");
		String rev="";
		String sp=" ";
		
		for (int i = 0; i < split.length; i++) {
			char[] c = split[i].toCharArray();
	for (int j = c.length-1; j >=0; j--) {
		rev=rev+c[j];
	}
	rev=rev+sp;
				}
System.out.println(rev);
	}

private void string2() {
	String s="JavaProgram";
	char[] cs = s.toCharArray();
	String res="";
	for (int i = s.length()-1; i >=0; i--) {
		System.out.print(cs[i]);	
	}	
}

private void string3() {
	
	
	
}
public static void main(String[] args) {
	
	StringMethod sm=new StringMethod();
	sm.string1();
	sm.string2();
	
}










}
