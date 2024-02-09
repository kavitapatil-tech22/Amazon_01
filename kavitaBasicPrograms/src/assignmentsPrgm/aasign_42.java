package assignmentsPrgm;
public class aasign_42 {	  
	public static void main(String[] args) {
		int upperBound = 10;
	    int lowerBound = 1;
	    int random=0;
	    // upperBound 20 will also be included
	    int range = (upperBound - lowerBound) + 1;
	    System.out.println("Random Numbers between 1 and 10:");
	    for (int i = 1; i <=10; i ++) {
	      // generate random number
	      // (int) convert double value to int
	      // Math.random() generate value between 0.0 and 1.0
	        random = (int)(Math.random() * range) + lowerBound;
	        System.out.print(random +",");
	        
	        double radius=Math.PI*random*random;	     
			double Area=Math.PI*radius*radius;	
			System.out.print(" ");
			System.out.print("  "+"Area of the Circle with radius "+ "' " +radius+" ' "+" "+"for "+i+"  "+"attempt : " +Area);
			System.out.println(" ");
	    }
	}
}
