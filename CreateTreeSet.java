import java.util.*;
class CreateTreeSet 
{
	public static void main(String[] args) 
	{
		SortedSet<String> f = new TreeSet<>();
		f.add("Banana"); f.add("Apple");f.add("Pineapple");f.add("Orange");
		System.out.println("set !" +f);

		f.add("Apple");
        System.out.println("set  after adding !" +f);

		f.add("banana");
        System.out.println("set  after adding banana = " +f);
	}
}
