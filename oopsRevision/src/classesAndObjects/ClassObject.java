package classesAndObjects;

class Car{
	String model;
	int speed;
	
	void Run() {
		System.out.println(model+" is driving on "+speed+" Per Hour Speed!");
	}
}

public class ClassObject {

	public static void main(String[] args) {
		Car c1 = new Car();//car is an object that will contains some states and behaviour
		c1.model = "Toyota";//state like it toyoto company car
		c1.speed = 90;
		c1.Run();//behaviour like it's running
	}
}

/*
 * What Is a Object?
 Objects are key to understanding object-oriented technology. Look around right now and you'll find many examples of real life object
 like Car is a object it can be of toyota, BMW or any other brand & it can have different behaviour like car is running, car changing gear etc
 so,
 Software objects are conceptually similar to real-world objects: they too consist of state and related behavior. 
 In java an object stores its state in variables and exposes it's behaviour through methods.
 
  Bundling code into individual software objects provides a number of benefits, including:

	Modularity: The source code for an object can be written and maintained independently of the source code for other objects.
Once created, an object can be easily passed around inside the system.

	Information-hiding: By interacting only with an object's methods, the details of its internal 
implementation remain hidden from the outside world.

	Code re-use: If an object already exists (perhaps written by another software developer), you can use that object in your program.
This allows specialists to implement/test/debug complex, task-specific objects, which you can then trust to run in your own code.

	Pluggability and debugging ease: If a particular object turns out to be problematic, you can simply remove it from your 
application and plug in a different object as its replacement. This is analogous to fixing mechanical problems in the real world.
eg. If a bolt breaks, you replace it, not the entire machine.

  * What Is a Class?
   In the real world, you'll often find many individual objects all of the same kind. There may be thousands of other Car in existence,
   all of the same make and model. Each Car was built from the same set of blueprints and therefore contains the same components.
   In object-oriented terms, we say that your Car is an instance of the class of objects known as Car.
   A class is the blueprint from which individual objects are created.
   
   the design of this class is based on the previous discussion of Car objects. The fields Model, Speed 
   represent the object's state,and the methods Run() define its interaction with the outside world.

	You may have noticed that the Car class does not contain a main method. That's because it's not a complete application;
	it's just the blueprint for Car that might be used in an application. The responsibility of creating and using 
	new Car objects belongs to some other class in your application.
 */
