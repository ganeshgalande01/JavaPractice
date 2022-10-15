package org.lambdaFucntion;
interface Inter1{
	public void StringReturn();
}
public class LambdaFunction {

	public static void main(String[] args) {
		
		Inter1 obj=()-> System.out.println("this is string method");
			
			obj.StringReturn();
	}

}

