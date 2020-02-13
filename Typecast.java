public class Typecast 
{
	public static void main(String[] args) 
	{
		double d = 10.5;
		byte b = (byte)d;
		short s = (short)d;
		int i = (int)d;
		long l = (long)d;
		float f = (float)d;

		System.out.println("Original value " +d );
		System.out.println("short " +s );
		System.out.println("int " +i );
		System.out.println("long " +l );
		System.out.println("float " +f );
		System.out.println("boolean " +b );
	}
}
