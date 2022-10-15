package org.BasicProgram;

public class MainMethodOverload {
	
 static void main() 
 {
		int a=10;
		System.out.println("value of a="+a);
		
	}
 
 void main(int x)
 {
 int b=x;
System.out.println("value of b="+b);

}
 
 public static void main(String args[])
 {
	 MainMethodOverload obj= new MainMethodOverload();
	 obj.main(11);
	 main();
	 //System.out.println("value of bl="+obj.bl);
 }
}
