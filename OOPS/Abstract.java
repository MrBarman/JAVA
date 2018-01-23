
		/*-----LET'S GET FAMILIAR WITH CONCEPT OF Abstract Class AND Abstract Method-----*/

abstract  class Car{ // abstract class 
abstract void drive(); //abstract method
void reference()
	{
		System.out.println("Method Inside ABSTRACT CLASS accessed using REFERENCE");
	}
void inherit()
	{
		System.out.println("Method Inside ABSTRACT CLASS accessed by INHERITING the class ");
	}
}

class Audi extends Car{
@Override
void drive() // Overriden method of Abstract class Car
	{
		System.out.println("Driving Audi");
	}
}

class Benz extends Car{
@Override
void drive() //Overriden again
	{
		System.out.println("Driving Benz");	
	}
}

class Driver{
void drive(Car c) 
	{
		c.drive();	
	}
}

public class Abstract{
public static void main(String... args)
	{
		Car c = new Audi(); //We cannot create instance of ABSTRACT CLASS, But we can create reference of ABSTRACT CLASS
		c.reference();
		Driver d = new Driver();
		Audi a = new Audi();
		a.inherit();
		d.drive(new Audi());
		d.drive(new Benz());

	}
}
