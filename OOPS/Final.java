
		/*-----TESTING final KEYWORD-----*/

class Final{
final String str;
Final(String s)
	{
		str=s;
		System.out.println("Final String of Constructor : "+str);
	}
void m1(String s)
	{
		//str=str+s; // cannot be reassigned since variable is declare as final, otherwise CompileTimeError
		System.out.println("Final String of Constructor inside m1(): "+str);
		System.out.println("Final String of method: "+s);
	}
public static void main(String... args)
	{
		final Final f=new Final("Test"); //now cannot modify 'f'
		Final fb =new Final("Hello");
		//f = fb;// cannot modify since object creation is final as mentioned above, otherwise CompileTimeError
		System.out.println(f);
		f.m1("Test 2");
		fb.m1("Hello again");
		System.out.println(fb); 
		fb=f;// possible since object creation is not final
		System.out.println(f);
		System.out.println(fb);// print same as 'f' since 'f' is assigned to 'fb'
	}
}


/*final class TestImmutable
{
	private int i;
	TestImmutable(int i)
	{
	this.i=i;
	}
	public TestImmutable modify(int i)
	{
	//this.i=i;
	if(this.i==i)
	{
		return this;
	}
	else
	{
		return(new TestImmutable(i));
	}
	}
}
class Final
{
	public static void main(String[] args)
	{
		TestImmutable t1=new TestImmutable(20);
		
		
		TestImmutable t2=t1.modify(20);
		System.out.println(t1==t2);
		
		
		
	}
}*/


