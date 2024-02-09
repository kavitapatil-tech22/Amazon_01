package assignmentsPrgm;

public class Assignment44 {
   /* Assignment 44: get exception at all three scenarios (A,B,C)in Assignment 39 */
	
	public static void main(String[] args) {
		String Empname[]=new String[3];
		Empname[0]="Ram";
		Empname[1]="Sita";
		Empname[2]= "Vishnu";	
		
		try{
			Empname[3]="Priya";			
		}
		catch(ArrayIndexOutOfBoundsException empname){
			System.out.println("Emp name array size was 3 and added new emp name so it will throw ArrayIndexOutOfBoundsException");
		}
		int Sno[] =new int[3];
		Sno[0]=1;
		Sno[1]=2;
		Sno[2]=3;
		
		try{
			Sno[3]=4;
		}
		catch(ArrayIndexOutOfBoundsException sno){
			System.out.println("Sno array size was 3 and added new Sno so it will throw ArrayIndexOutOfBoundsException");
		}
		
		double EmpSal[]=new double[3];
		EmpSal[0]=6543;
		EmpSal[1]=9685;
		EmpSal[2]=7463;
		
		try{
		  EmpSal[3]=3563;
		}
		catch(ArrayIndexOutOfBoundsException empsal){
			System.out.println("Empsal array size is 3 and added new Emp salary so it will throw ArrayIndexOutOfBoundsException ");
		}
	}
}
