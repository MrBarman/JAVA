		/*-----UNDERSTANDING STATIC BLOCKS-----*/

class StaticBlock{
static int n; //static variable
int y; //nonstatic variable
static //static block
	{
		n=1;
		System.out.println("Inside static block, static value: "+n);
		m1(); //we can call static method from the static block of the same class directly
		StaticBlock sb = new StaticBlock();
		sb.y=3; //nonstatic varible is accessible from static block using Object
		sb.m2(); //we should call nonstatic method from static block using Object
	}
StaticBlock()
	{
		System.out.println("Inside Constructor");
	}
void m2()
	{
		System.out.println("Inside Nonstatic method,nonstatic value: "+y);
	}
static void m1()
	{
		System.out.println("Inside Static method");
	}
public static void main(String... args)
	{
		System.out.println("Inside main method");//main() will be executed last
	}
static
	{
		n=2;
		System.out.println("Inside Static block,static value: "+n);
	}
}
