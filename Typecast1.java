public class Typecast1
{
	public static void main(String[] args) 
	{
		byte b = 10;
		short s = b;
		int i = b;
		long l = b;
		float f = b;
		double d = b;

		// System.out.println("Original value " +d );
		System.out.println("short " +s );
		System.out.println("int " +i );
		System.out.println("long " +l );
		System.out.println("float " +f );
		System.out.println("double " +d );
	}
}