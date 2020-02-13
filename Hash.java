import java.util.*;
class Hash 
{
	public static void main(String[] args) 
	{
		Set<Integer> n = new HashSet<>();
		n.add(2); n.add(3);n.add(4);n.add(5);n.add(6);n.add(7);n.add(8);n.add(9);
		System.out.println(n);

		boolean isRem = n.remove(9);
		System.out.println(n);

		List<Integer> p = new ArrayList<>();
		p.add(4);
		p.add(5);

		n.removeAll(p);
		System.out.println(n);

		 n.removeIf(num -> num%2 == 0);
		 System.out.println("After removeIf() => " + n);

		 n.clear();
         System.out.println("After clear() => " + n);

	}
}
