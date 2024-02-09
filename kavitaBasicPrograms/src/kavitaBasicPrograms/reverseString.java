package kavitaBasicPrograms;

public class reverseString {
	
	public static void main (String[] args)
	{
	
	String str= "Kavita", nstr="";
    char ch;
    
    
   
     System.out.println("Original word: " + str);
     
     //System.out.println("Kavita") ;
   
     for (int i=0; i<str.length(); i++)
     {
    	 ch= str.charAt(i); //extracts each character
    	 nstr= ch+nstr; //adds each character in front of the existing string
     }
     System.out.println("Reversed word: "+ nstr);
     
	}

}
