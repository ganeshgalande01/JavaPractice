package org.Demo;

abstract public class ABC {
	
	abstract public int add(int a, int b);

	public static void main(String[] args) {
		
		ABC obj= new ABC(){
			public int add(int a, int b)
			{
				return a+b;
			
			}
		};
				
		System.out.println(obj.add(11,12));

	}

}
