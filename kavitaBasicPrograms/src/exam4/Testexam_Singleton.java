package exam4;

import java.util.UUID;

public class Testexam_Singleton {

	
	// Initializing values of single and ID to null.
    private static Testexam_Singleton single = null;
    private String ID = null;
 
    private Testexam_Singleton()
    {
        /* Make it private, in order to prevent the 
           creation of new instances of the Singleton
           class. */
 
        // Create a random ID
        ID = UUID.randomUUID().toString();
    }
 
    public static Testexam_Singleton getInstance()
    {
        if (single == null)
            single = new Testexam_Singleton();
        return single;
    }
 
    public String getID()
    {
        return this.ID;
    }

	
	public static void main(String[] args) {
		Testexam_Singleton s = Testexam_Singleton.getInstance();
        System.out.println(s.getID());

	}

}
