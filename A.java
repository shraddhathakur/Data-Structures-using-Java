class A 
{
	static int amount = 100;                           //instance var
	static int pin =  2315;                     //static var
	static void showLocal()
	{
		int age_A = 35;   
		System.out.println(35*2);
	}
	public void demoLocal(){
		int age_B = 30;
	}
	static  void demoinstance(){                // due to public, call via obj else static can be called directly
		int interest = 30;
		int Total = amount*interest;
	
		System.out.println(Total);
	}

	public static void main(String a[])
	{
	A obj= new A();
	showLocal();
	demoinstance();
	}

}

