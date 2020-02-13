import java.util.*;
class  SearchLinkedlist
{
	public static void main(String[] args) 
	{
		LinkedList<String> e = new LinkedList<String>();
		e.add("John");e.add("David");e.add("Lara");e.add("Chris");e.add("Steve");e.add("David");
		System.out.println("Does it contain Lara ? " +e.contains("Lara"));
		System.out.println(e.indexOf("Steve"));
		System.out.println(e.indexOf("Mark"));
		System.out.println(e.lastIndexOf("David"));
		System.out.println(e.lastIndexOf("Bob"));

	}
}
