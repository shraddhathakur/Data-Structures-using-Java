class Cons 
{
	 int ac ;
	 int acc;
	Cons(int x , int y)
	{
		ac = x;
		acc = y;
	}
	public static void main(String[] args) 
	{
		Cons c = new Cons(5,10);		
		Cons c1 = new Cons(15,30);
		System.out.println(+c.ac); System.out.println(+c.acc);

		System.out.println(+c1.ac ); 
		System.out.println(+c1.acc );
	}
}
