
		/*-----UNDERSTANDING Constructors-----*/		

class Test{
String name;
int id;
Test() // Default CONSTRUCTOR(No Argument constructor)
	{
		System.out.println("Inside Default Constructor");
	}
Test(String s, int n)
	{
		name=s;
		id=n;
	}

Test(Test t) //COPY CONSTRUCTOR
	{
		name=t.name;
		id=t.id;
	}
}
class Constuctor{
	public static void main(String... args)
	{
		Test t1= new Test(); //Invokes no argument constructor 
		Test t2= new Test("Java", 1); //Invoke the Constructor with two  arguments
		Test t3= new Test(t2); //Invoke copy constructor 
		System.out.println("Name: "+t2.name+" Id: "+t2.id);
		System.out.println("CopyName: "+t3.name+" CopyId: "+t3.id);

	}
}
