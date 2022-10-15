package org.BasicProgram;

public class TypeCast {

	public static void main(String[] args) {
		int a=20;
		int b=78;
		System.out.println(a);
		System.out.println(b);
		byte b1=(byte)a; //explicit conversion
		System.out.println(b1);
		long c=b;// implicit conversion
		System.out.println(c);
	}

}
