import java.io.*;
import java.util.*;
class Testthrows 
{
	void m() throws IOException
	{
		throw new IOException("device error"); //checked
	}
    void n() throws IOException
	{
		m();
	}
	void p()
	{
		try
		{
			{
				m();
			}
		}
		catch(Exception e) 
		{
          System.out.println("exception handled");
		}
	}
	public static void main(String[] args) 
	{
		Testthrows obj = new Testthrows();
		obj.p();
		System.out.println("normal flow");
	}
}
