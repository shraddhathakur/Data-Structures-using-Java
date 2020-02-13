class Cons1
{
	 int sno ;
	 String name;
	 String sub;

	Cons1(int x , String n, String s)
	{
		sno = x;
		name = n;
		sub = s;
	}
	public static void main(String[] args) 
	{
		Cons1 c = new Cons1(5,"Ram", "Chemistry");		
		Cons1 c1 = new Cons1(15,"Shubhika", "Biology");
		System.out.println(c.sno); System.out.println(c.name);System.out.println(c.sub);

		System.out.println(c1.sno);System.out.println(c1.name);System.out.println(c1.sub);
	}
}
