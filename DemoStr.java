class DemoStr 
{
	public static void main(String[] args) 
	{
		String str1 = "selenium";
		String str2 = "SELENIUM";
		String str3 = "seleniuma";
		String str4 = "selenium";
		String str5 = "Testing";

		System.out.println(str1.compareTo(str2));//pos vale
		System.out.println(str1.compareTo(str3));//neg
		System.out.println(str1.compareTo(str4));//0
		System.out.println(str1.equals(str2));//false
		System.out.println(str1.equals(str4)); //true
		//concat
		System.out.println(str1.concat(str5));
		System.out.println(str1+  str5);
		//charAt
        System.out.println(str1.charAt(1));
		//equalsIgnoreCase
		System.out.println(str1.equalsIgnoreCase(str2));//true
		System.out.println(str1.equalsIgnoreCase(str5));//false
		//length
		System.out.println(str1.length());
		System.out.println(str5.length());


	}
}
