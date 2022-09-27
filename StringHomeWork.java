package stringHomeWork;

public class StringHomeWork {

	public static void main(String[] args) {
		
		//String Declaration:
		
		String city= "Jalalabad";

		String fname = "Jawid";
		String lname = "Rashidi";
		
		// concat method:
		
		String name= fname.concat(lname); 
		System.out.println(name);
		
		// concat method with space:
		String name2= fname.concat(" ").concat(lname); 
		System.out.println(name2);
		
		
		// Length method:
		int len = city.length();
		System.out.println(len);
		
		// char method:
		char c= city.charAt(4);
		System.out.println(c); 

		// contains method:
		boolean b= city.contains("aba");
		System.out.println(b);
		
		// Starts method:
		boolean b1= city.startsWith("ja");
		System.out.println(b1);
		
		// End methods:
		boolean b2= city.endsWith("ad");
		System.out.println(b2);
		
		// Equals method:
		boolean b3= city.equals("Jalalabad");
		System.out.println(b3);
		
		// Equals with IgnoreCase methods:
		boolean b4= city.equalsIgnoreCase("jalalabad"); 
		System.out.println(b4);

		//Compare method
		int i= city.compareTo("jalalabad");
		if(i== 0)
		{
			System.out.println("Both Strings are the same");

		}
		else 
		{
			System.out.println("Strings are not the same");

		}

		// Compare and Ignore case method:
		int j= city.compareToIgnoreCase("jalalabad");
		if (j== 0)
		{
			System.out.println("Both Strings are the same");

		}
		else 
		{
			System.out.println("Strings are not the same");

		}
		
		// Substring method
		String subS= city.substring(0, 5); 
		System.out.println(subS);
		
		//Substring with one index
		String subS2= city.substring(4); 
		System.out.println(subS2);
		
		
		// new strings:
		
		String cities= "Kabul#Jalalabad#Mazar#Herat#Ghazni";
		System.out.println(cities);
		
		// Split method

		String str[] = cities.split("#");
		System.out.println(str.length);

		for(int k=0; i<str.length; i++)
		{
			if(str[k].startsWith("M"))
			{
				System.out.println(str[k]);
			}
		}
	}
	

}
