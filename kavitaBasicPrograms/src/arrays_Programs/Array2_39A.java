package arrays_Programs;
public class Array2_39A
{
  /* Assignment 39A :Create an array with length 5 a)to store name of lenth 5 b)to store the rollno of legth 5 c)to store the salary of lenth 5 
Output should be displayed as
 Ram   Sita   laxman  Visnhu 
  1     2       3       4 
 6543  9685    7463    8786  */
	
	public static void main(String[] args) {		
		String Empname[]=new String[4];
		Empname[0]="Ram";
		Empname[1]="Sita";
		Empname[2]= "Vishnu";
		Empname[3]="Krishna";
		
		int Sno[] =new int[4];
		Sno[0]=1;
		Sno[1]=2;
		Sno[2]=3;
		Sno[3]=4;
		
		double EmpSal[]=new double[4];
		EmpSal[0]=6543;
		EmpSal[1]=9685;
		EmpSal[2]=7463;
		EmpSal[3]=8786;
   //	System.out.print(Empname[0].concat("     ").concat(Empname[1].concat("       ")).concat(Empname[2]));
   //	System.out.println(" ");
   //	System.out.print(Sno[0]+"         "+Sno[1]+"          "+Sno[2]);
   //	System.out.println(" ");
   //	System.out.println(EmpSal[0]+ "  "+EmpSal[1]+"     "+EmpSal[2]);		
		System.out.printf("     Employee details         %n");
		System.out.printf("--------------------------------%n");	
		System.out.printf("| %-10s | %-8s | %4s | %4s |%n", Empname[0], Empname[1], Empname[2],Empname[3]);
		System.out.printf("| %-10s | %-8s | %-6s | %-6s |%n", Sno[0] , Sno[1], Sno[2], Sno[3]);
		System.out.printf("| %-10s | %-8s | %4s | %4s |%n", EmpSal[0], EmpSal[1], EmpSal[2] , EmpSal[3]);		
	}
}





