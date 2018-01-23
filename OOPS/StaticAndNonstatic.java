		/*-----UNDERSTANDING Static AND Nonstatic VARIABLES AND METHODS-----*/

class Test{
int i=10;
static int j=20;
void m1()
	{
		System.out.println("Inside Test class Non-Static method: "+j++ +" "+i++);
		m2(); //static method accessible inside nonstatic method
	}
static void m2()
	{
		System.out.println("Inside Test class Static method: "+j);
		//i++; /*Static and NonStatic variables are not accessible inside static methods. If we remove comment lines then it will give CompileTimeError*/
		//m1();
	}
}
class StaticAndNonstatic{
void m2()
	{
		System.out.println("Inside mainclass Non-Static method: ");
		m3();
	}
static void m3()
	{
		System.out.println("Inside mainclass Static method: ");
		//i++;
		//m1();
	}

public static void main(String... args)
	{
		Test t1=new Test();
		t1.i=12;
		Test.j=21;
		t1.m1();
		t1.m2();
		Test t2=new Test();
		System.out.println("t2 object i value: "+t2.i);
		//Test.m1(); //To call NonStatic method, we have to create Object otherwise it will give CompileTimeError
		Test.m2();
		t2.m2();
		StaticAndNonstatic stn=new StaticAndNonstatic();
		stn.m2();
		Test.m2();
		m3();

	}
}
