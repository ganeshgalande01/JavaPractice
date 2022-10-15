package org.BasicProgram;

abstract public class AbstractExp1 {
	abstract public void add();

	public static void main(String[] args) {
		AbstractExp1 obj= new AbstractExp1(){
			public void add()
			{
				int a=10;int b=20;
				System.out.println("sum of two number= "+(a+b));
			}
		};

		obj.add();
	}

}
