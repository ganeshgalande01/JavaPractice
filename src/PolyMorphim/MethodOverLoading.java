package PolyMorphim;

class Animal{
	String color;
	String Name;
	
	public void printInfo(String color) {
		System.out.println(color);
	}
	
	public void printInfo(String Name,String color) {
		System.out.println(Name+"  "+color);
	}
	
	public void printInfo(int Anmiallegs) {
		System.out.println(Anmiallegs);
	}
	
	
}
public class MethodOverLoading {

	public static void main(String[] args) {
		Animal anl= new Animal();
		
		anl.Name="Tiger";
		anl.printInfo("red");
		anl.printInfo("tiger","red");
		anl.printInfo(4);
		

	}

}
