class Doc 
{
	void doc_det()
	{
		System.out.println("Hello Doctor!");
	}
}
class Surgeon extends Doc
{
	void sur_Det()
	{
		System.out.println("Hello Surgeon!");
	}
}
public class Hos
{
	public static void main(String[] args) 
	{
	Surgeon s = new Surgeon();
	s.doc_det();
	s.sur_Det();
	}
}
	
	

