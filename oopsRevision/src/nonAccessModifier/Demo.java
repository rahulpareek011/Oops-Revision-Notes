package nonAccessModifier;

//abstract
abstract class Hello{
	//written without body
	abstract void printHello();
}

public class Demo extends Hello{
	//1. final 
	final int a = 10;//with variable -> cannot reassigned
	//final with method -> cannot overridden
	//final with class - cannot inherited by other
	
	//abstract class method implemented here
	void printHello(){
		System.out.println("hello world");
	}
	
	//2. static -> directly accessible in not-static field
	static int b = 20;
	public static void main(String[] args) {
		Demo d1 = new Demo();
		//d1.a = 20; cannot reassigned
		System.out.println(Demo.b);
		System.out.println(b);
		d1.printHello();
	}
}
