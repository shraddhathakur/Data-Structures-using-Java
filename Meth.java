import java.util.*;
class Meth
{

	static void Add()
	{
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int b = sc.nextInt();
		int c = num+b;

		System.out.println("Add = " +c);
	}

	public void mul(){
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int b = sc.nextInt();
		int c = num*b;

		System.out.println("Mul = " +c);
	}
	

	public static void main(String a[])
	{
	Meth obj= new Meth();
	obj.mul();
	Add();
	
	}

}
