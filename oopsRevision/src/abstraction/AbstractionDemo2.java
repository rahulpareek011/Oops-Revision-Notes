package abstraction;

abstract class Creature{
	abstract void speak();
	void sleep(String name) {
		System.out.println(name+" is sleeping");
	}
	Creature(){
		System.out.println("Constructor invoked");
	}
}

class Human extends Creature{
	void speak(){
		System.out.println("Human talks");
	}
}

class Dog extends Creature{
	void speak() {
		System.out.println("Dog barks");
	}
}

public class AbstractionDemo2 {
	//In abstraction there is two abstraction
	//partial abstraction -> for it use abstract class
	//full abstraction -> for it use interface
	
	//in partial abstraction we provide some common behavior implementation by default and some are implemented internally using concrete methods
	//In full abstraction we provide only functionality but its implementation is done internally
	public static void main(String[] args) {
		Creature cr1 = new Dog();
		cr1.sleep("Dog");
		cr1.speak();
		Creature cr2 = new Human();
		cr2.speak();
		cr2.sleep("Rahul");
		//abstraction also enables runtime polymorphism 
		//abstraction -> hides internal implementation
		//polymorphism -> object decides implementation at runtime
		//like in runtime it is decided by object that which implementation is shown
		Creature c3 = new Creature() {
			void speak() {
				System.out.println("Unknown creature speaking");
			}
		};
		c3.speak();
		c3.sleep("Unknown Creature");
	}
}
