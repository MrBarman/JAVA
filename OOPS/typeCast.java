		/*-----TYPECASTING EXAMPLE-----*/

class typeCast{
public static void main(String... args)
	{
		byte b,bb=2;
		char c='A';
		short s=10;
		int a, i=257;
		double d=323.36;
		System.out.println("Integer to byte");
		b=(byte)i;
		System.out.println("i="+i+" b="+b);
		System.out.println("Double to integer");
		i=(int)d;
		System.out.println("d="+d+" i="+i);
		int result=(c+bb)*s;
		System.out.println("Result="+result);
		
	}
}
