class Cons2
{
	Cons2()
	{
      System.out.println("this is default cons");
	}
	void mymethod()
	{
		System.out.println("This is my void");
	}

	public static void main(String[] args) 
	{
		Cons2 c = new Cons2();		
		c.mymethod();
		
	}
}
