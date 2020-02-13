class  X 
{
	void methodX()
	{
		System.out.println("Hello X!");
	}
}
class Y extends X 
{
	void methodY()
	{
		System.out.println("Hello Y!");
	}
}
class Z extends Y{
	public void methodZ()
	{
		System.out.println("Hello Z!");
	}

	public static void main(String[] args) 
	{
	Z o= new Z();
	o.methodZ();
	o.methodY();
	o.methodX();

	}
}
	
	

