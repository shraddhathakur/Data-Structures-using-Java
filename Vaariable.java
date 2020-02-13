class A 
{
	public void showLocal()
	{
		int age_A = 35; //local var
		System.out.println(age_A);
	}
	/*public void show()
	{
		System.out.println(age_A);
	}
*/ // this block will give error if executed in main
{
}
}
public class Vaariable
{

	public static void main(String[] args) 
	{
		A obj = new A();
		obj.showLocal();
		// obj.show();
	}
}
