package InteritanceExamples;

  class Parent1 {
	 String name;
	
	 public void printName()
	 {
		 System.out.println(this.name);
	 }
	
}
 
 

public class SingleLevelInheritance extends Parent1  {

	public static void main(String[] args) {
		
		SingleLevelInheritance obj= new SingleLevelInheritance();
		obj.name="Ganesh";
		obj.printName();
		
	}

}
