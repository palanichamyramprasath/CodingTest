package javaPractice;

abstract class Base {
	Base(){
		System.out.println("Base constructor called");
	}
	abstract void fun();
	
}
class Derived extends Base{
	Derived(){
		
		System.out.println("Derived constructor called");
	}
	void fun() {
		System.out.println("Derived fun() called");
	}
}

public class AbastractDemo{
	
	public static void main(String args[]) {
		Base b = new Derived();
		b.fun();
	}
}