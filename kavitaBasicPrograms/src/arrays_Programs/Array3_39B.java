package arrays_Programs;
public class Array3_39B {
  /* Assignment 39B :Create an array with length 5
	a)to store name of lenth 5
	b)to store the rollno of legth 5
	c)to store the salary of lenth 5 
	Output should be displayed as 
	Ram  1  6543
	Sita  2   9685
	Laxman  3   7463
	Vishnu  4    8786
	Krishna  5   9876
   */
	public static void main(String[] args) {
		String Empname[]=new String[3];
		Empname[0]="Ram";
		Empname[1]="Sita";
		Empname[2]= "Vishnu";
		
		int Sno[] =new int[3];
		Sno[0]=1;
		Sno[1]=2;
		Sno[2]=3;
		
		double EmpSal[]=new double[3];
		EmpSal[0]=6543;
		EmpSal[1]=9685;
		EmpSal[2]=7463;
//		System.out.println(Empname[0]+"  "+(Sno[0])+ "  " +(EmpSal[0]));
//		System.out.println(Empname[1]+"  "+(Sno[1])+ "  " +(EmpSal[1]));
//		System.out.println(Empname[2]+"  " +(Sno[2])+" " +(EmpSal[2]));
		
		System.out.printf("     Employee details         %n");
		System.out.printf("--------------------------------%n");
		System.out.printf("| %-10s | %-10s | %6s |%n", Empname[0], Sno[0], EmpSal[0]);
		System.out.printf("| %-10s | %-10s | %6s |%n", Empname[1], Sno[1], EmpSal[1]);
		System.out.printf("| %-10s | %-10s | %6s |%n", Empname[2], Sno[2], EmpSal[2]);
	}
}
