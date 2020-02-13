class Throw2
{
	static void validate(int age, int w)
	{
		if(age<=12 && w<=40)
         throw new ArithmeticException ("not eligible");
		else
         System.out.println("valid");
	}
	public static void main(String[] args) 
	{
		validate(15,41);

		System.out.println("rest of the code");
	}
}
