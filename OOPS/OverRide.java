
		/*-----UNDERSTATING HOW Overriding WOERKS-----*/

class A{
int i,j;
A(int a,int b)
	{
		i=a;
		j=b;
	}
void show()
	{	
		System.out.println("Value of i and j: "+i+" and "+j);
	}
}
class B extends A{
int k;
B(int a,int b,int c)
	{
		super(a,b);
		k=c;
	}

@Override // It is an annotation. If the method to be overriden not present in Super Class the it will give CompileTimeError 
void show()
	{
		System.out.println("Value of k: "+k); //overriden method for class A
	}
}

class OverRide{
public static void main(String... args)
	{
		B b = new B(1,2,3);
		b.show();
	}
}
