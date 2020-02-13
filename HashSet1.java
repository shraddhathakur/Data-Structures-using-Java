import java.util.*;
class  Customer
{
private long id;
private String name;

public Customer(long id, String name)
	{
	this.id = id;
	this.name = name;
	}
	public long  getId()
	{
		return id;
	}
	public void setId(long id)
	{
		this.id = id;
	}
	public String  getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public boolean equals(Object o )
	{
		if(this==o)
		{
			return true;
		}
		if(o==null || getClass() != o.getClass())
		{
			return false;
		}
}

    public int hashCode()
	{
		return Objects.hash(id);
    }
     public String toString()
	{
		 return "Customer " + "id = " + id +"name " +name + '\'' + '}';
	}}


	public class HashSet1
	{
	
	public static void main(String[] args) 
	{
		Set<Customer> c = new HashSet<>();
		c.add(new Customer(101, "Rajeev"));
		c.add(new Customer(102, "Sachin"));
		c.add(new Customer(103, "Chris"));

		c.add(new Customer(101, "Rajeev"));


		System.out.println(c);
	}
}
