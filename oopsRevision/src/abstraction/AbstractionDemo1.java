package abstraction;

/*
 Interface Rules (Pre-Java 8)
Before Java 8:
All methods → public abstract
All variables → public static final
No constructors allowed
No method body allowed

From Java 8:
default methods allowed (have body)
static methods allowed (have body)

From Java 9:
private and private static methods allowed (for code reusability inside interface)

Variables in interface are:
public
static
final
 */


interface HumanInCar{
	void start();
	void drive();//public abstract by default
	
//	HumanInCar(){
//		//constructor not allowed in interface
//	}
}

class Car implements HumanInCar{
	public void start(){
		System.out.println("Car is started");
	}
	
	public void drive() {
		System.out.println("Car is running");
	}
}

public class AbstractionDemo1{
	//Abstraction in java says we hide internal complex implementation
	//like how work is done
	//and only show relevant functionality
	
	//you or user can only see functionality but can't see it's implementation
	
	
	public static void main(String[] args) {
		HumanInCar hic = new Car();//we are using hic for only seeing functionality
		//the implementation is in Car which we doen't know
		hic.start();
		hic.drive();
		
		//this is also example of full abstraction where we provide only 
		//functionality but its implementation is done internally
		
		HumanInCar hic2 = new HumanInCar() {

			@Override
			public void start() {
				System.out.println("unknow guy started car");
			}

			@Override
			public void drive() {
				System.out.println("Unkown driver started driving");
			}
			
		};
		hic2.start();
		hic2.drive();
	}
	
}
