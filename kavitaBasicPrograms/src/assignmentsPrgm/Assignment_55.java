package assignmentsPrgm;

public class Assignment_55 {
   /* Assignment 55 : Date:18/01/2024     
Write the java program for the below output
a, a^2, a^3, a^4, a^5, a^6.....
2, 4, 8, 16, 32, 64, 128, .... */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num1=2;
       int j=1;
       for(int i=1;i<=10;i++) {
    	   int num2=num1*j;
    	   System.out.print(num2 + "," +  "  ");
    	   j=num2;
       }
	}

}
