package arrays_Programs;
public class Array1_39C {
	/*  Assignment 41/39C :In a class there is a array 
         a)to store name of lenth 5  b)to store the rollno of legth 5   c)to store the salary of lenth 5  */
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
		
		System.out.println(Empname[0]);
		System.out.println(Sno[0]);
		System.out.println(EmpSal[0]);		
		System.out.println(" ");
		
		System.out.println(Empname[1]);
		System.out.println(Sno[1]);
		System.out.println(EmpSal[1]);
		System.out.println(" ");
		
		System.out.println(Empname[2]);	
		System.out.println(Sno[2]);
		System.out.println(EmpSal[2]);
	}
}
