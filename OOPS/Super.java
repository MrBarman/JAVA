

		/*-----UNDERSTADING THE VARIOUS FEATURES OF Super-----*/

class Person
{
	int ID=7;
	void message()
		{
			System.out.println("Inside Person class method");
		}
}
class Student extends Person{
	int ID=3;
	void message()	
		{
			System.out.println("Inside Student class method");
		}
	void display()
		{	
			System.out.println("Student ID: "+ID); //It will print Student class ID
			message(); //It will call Student class message()
			System.out.println("Person ID: "+super.ID); //It will print Person class ID
			super.message(); //It will call Person class message()
		}
}
		
		/*-----USE OF Super WITH CONSTRUCTOR-----*/

class A{
	int a;
	A(int i)
	{
		this.a=i--;
		System.out.println("Value inside Parent Constructor: "+i);
		
	}
	
		
	

	
}
class B extends A{
	B(int i)
	{
		super(++i); //we have to provide super in B constructor since A(Parent) donot have any default constructor.
		System.out.println("Value inside Child Constuctor: "+i);
	}
}

class Super{
public static void main(String... args){
	Student s = new Student();
	B b = new B(5);
	s.display();
}
}




