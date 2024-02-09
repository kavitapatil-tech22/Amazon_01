package exam4;
import java.util.Scanner;
public class Even_Odd_Num {
	public static void main(String[] args) {
       Scanner s = new Scanner(System.in);          
       System.out.print(" Enter the max number: ");
       int num = s.nextInt();
       System.out.print("\n Even numnbers : ");
       for(int i=0;i<=num;i+=2)
       {
          System.out.print(i +" ");
       }
       System.out.print("\n\n Odd numbers : ");
       for(int i=1;i<=num;i+=2)
       {
          System.out.print(i +" ");
       }
	}
}
