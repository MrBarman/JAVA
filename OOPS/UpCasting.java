
		/*-----UNDERSTANDING HOW Upcasting WORKS----- */

class Car{
void Wheels(Car c)
	{
		System.out.println("Car has wheels");
	}
void gear(Car c)
	{
		System.out.println("Car has gear");
	}
void breaks(Car c)
	{
		System.out.println("Car has breaks");
	}
}

class Audi extends Car{
void gps()
	{
		System.out.println("Audi has GPS feature ");
	}	
}

class AudiRS6 extends Audi{

@Override
void gps()
	{
		System.out.println("Audi RS6 model has GPS with advance enhancements");
	}
void price()
	{
		
		System.out.println("Audi RS6 model is Very Expensive");
	}
}

class UpCasting{
public static void main(String... args)
	{
		
		AudiRS6 ars = new AudiRS6();
		Audi a=ars; // Upcasting
		a.gps(); // It will Invoke gps() of AudiRS6 class
		ars.gps(); // It will also Invoke gps() of AudiRS6 class
		a.Wheels(ars); // Automatic Upcast to Car class
		
	}

}

