package arrays_Programs;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        //Input the term
        System.out.println("Please enter the term of your grade calculation (for example, Fall 2015): ");
        String term = scanner.nextLine();

        //Input the number of courses that the student is enrolled in
        System.out.println("Please enter the number of courses that you are enrolled in "+term+": ");
        int numberofcourses = scanner.nextInt();

        //Declaration
        String ClassName[] = new String[numberofcourses];
        String Description[] = new String[numberofcourses];
        String Grade[] = new String[numberofcourses];
        int Units[] = new int[numberofcourses];

        //Arrays for class number, description, units, grade, grades point
        //Here, input class number, description, units, and grades
        for(int i = 0; i < numberofcourses; i++)
        {
            scanner.nextLine();
            System.out.println("Please enter your #"+(i+1)+" class name: ");
            ClassName[i] = scanner.nextLine();
            System.out.println("Please enter your #"+(i+1)+" class description: ");
            Description[i] = scanner.nextLine();
            System.out.println("Please enter your #"+(i+1)+" class units: ");
            Units [i] = scanner.nextInt();
            System.out.println("Please enter your #"+(i+1)+" class grade: ");
            Grade[i] = scanner.nextLine();
        }
        
        System.out.println("Class Grades - "+term+" Term");
        System.out.println("Office Grades");
        System.out.println("Class \t \t Description \t \t Units \t \t Grade \t \t Grade Points");
        for(int i = 0; i < numberofcourses; i++)
        {
           //System.out.println(ClassName[i]+"\t \t"+Description[i]+"\t \t"+Units[i]+"\t \t"+Grade[i]);
        	System.out.printf("%-15s %-15s %-15s ",ClassName[i],Description[i],String.format("%5d", Units[i]),Grade[i]);
        }

	}

}
