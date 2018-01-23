		/*-----UNDERSTANDING THE WORKING MECHANISM OF NonStatic BLOCK-----*/

class NonStaticBlock{
int a;
	{ //Nonstatic block
		a=1;
		System.out.println("Indide Nonstatic Block, value is: "+a);
		m1(); //Static method directly accessible from NonStatic block
		m2(); //NonStatic method directly accessible
		this.a=5; //Use of this is possible
		System.out.println("Value after using THIS in Nonstatic Block: "+a);
	}
NonStaticBlock()
	{
		System.out.println("Inside Constructor, value is: "+a);
	}
void m2()
	{
		System.out.println("Inside NonStatic method,value is: "+a);
	}
static void m1()
	{
		System.out.println("Inside Static method");
	}
public static void main(String... args)
	{
		System.out.println("Inside main");
		NonStaticBlock nsb = new NonStaticBlock();
		nsb.a=14;
		System.out.println("Value of a: "+nsb.a);
	}
	{ //Nonstatic block
		a=2;
		System.out.println("Inside NonStaticBlock, value is: "+a);
	}

}
