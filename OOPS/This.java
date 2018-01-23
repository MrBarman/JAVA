
		/*-----TESTING SIMPLE WORKING MECHANISM OF this KEYWORD-----*/ 

class ThisTest{
int a;
ThisTest(int a)
	{
		//a=a; /* It will assign the local variable to itself */
		this.a=a; //this.a refers the instance variable a 
		this.show(); //It is possible to call nonstatic method from constructor using this keyword
	}

void show()
	{
		System.out.println("Inside show()");
		this.nsm(this.a); //calling a nonstatic method from nonstatic method is possoible. We can use this to pass value in parameter 
	}
void nsm(int a)
	{
		System.out.println("Inside non static method,passed value :"+a);
		//this=null; /* will give CompileTimeError. We cannot assign any value to this */
		this.sm(); //calling static method from nonstatic method using this  
	}
void sm()
	{
		System.out.println("Inside Static method");
	}
void method(int a)
	{
		int b=a;
		a=20; //local variable
		System.out.println("Local variable: "+a);
		System.out.println("Received variable: "+b);
		System.out.println("Instance variable: "+this.a);
	}
}

		/*-----RETURNING CURRENT CLASS OBJECT-----*/

class ReturnThis{
int a;
int getA()
	{
		return a;
	}
void setA(int a)
	{
		this.a=a;
	}
ReturnThis show() //It will return current class object
	{
		return this;
	}
}

		/*-----USING this KWYEWORD WITH CONSTRUCTOR-----*/

class ConstructorThis{
int l,b,h;
ConstructorThis(){}
ConstructorThis(int l,int b, int h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
		System.out.println("L: "+l+" B: "+b+" H: "+h);
		System.out.println(this); //will print current CLASSNAME along with some HASHCODE 
	}
ConstructorThis(int a)
	{
		this(a,a,a); // will call constructor with three parameters
	}
ConstructorThis(ConstructorThis ct)
	{
		this(ct.l,ct.b,ct.h);
	}

}

		/*-----MAIN CLASS or CLASS THAT CONTAINS MAIN METHOD-----*/

class This{
public static void main(String... args)
	{
		ThisTest t = new ThisTest(7);
		t.a=2;
		t.nsm(t.a);
		t.method(3);
		ReturnThis rt1 = new ReturnThis();
		rt1.setA(36);
		System.out.println(rt1.getA());
		ReturnThis rt2 = rt1.show(); //rt2 can store returning object
		System.out.println(rt2.getA());
		ConstructorThis ct1 = new ConstructorThis(9);
		ConstructorThis ct2 = new ConstructorThis(1,2,3);
		ConstructorThis ct3 = new ConstructorThis(ct2);
		 
	}
} 
