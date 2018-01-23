		/*-----OVERLOADDING EXAMPLE-----*/

class Add{
void m1(Object o)
	{	
		System.out.println("Inside Object type method");
	}
/*void m1(String s)
	{
		System.out.println("Inside Child of object - String");
	}*/
void m1(StringBuffer s)
	{
		System.out.println("Inside Child of object - StringBuffer");
	} // StringBuffer will be selected because compiler always selects subclasses on possibility
int add(int a, int b)
	{
		System.out.println(a+b);
		return 1;
	}
void add(String s1)
	{
		add(s1,s1+s1);
	}
void add(String s1,String s2)
	{
		 add(s1,s2,s1+s2);
	}
void add(String s1,String s2,String s3)
	{
		System.out.println(s3+s1+s2);
	}
void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}

}


class overLoad{
public static void main(String... args){
	Add a1=new Add();
	//Add a2=new Add();
	int x=a1.add(1,2);
	System.out.println("Overloading with different returntype, value:"+x);
	a1.add(1,2,3);
	a1.add("java");
	a1.m1(null); //HERE COMPILER WILL SELECT MOST SPECIFIC METHOD BECAUSE "String" AND "StringBuffer" ARE SUB CLASSES OF "Object" CLASS. SO THE COMPILER WILL GENERATE CompileTimeError. BUT IF WE REMOVE ANYONE("String"/"StringBuffer"),THEN THE COMPILER WILL SELECT THE ONE WHIS IS NOT REMOVED
}
}
