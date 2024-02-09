package arrays_Programs;
public class Assignment33 {
  /* Assignment 33 : Store all the data types using the concept of array */
	public static void main(String[] args) {
		byte num5[] =new byte[2];
	     num5[0]=10;
	     num5[1]=20;     
	     for(int i=0;i<2;i++) {
	  	   System.out.println("Int DataType :" +num5[i]);
	     }     
		
     int num[] =new int[3];
     num[0]=100;
     num[1]=200;
     num[2]=300;     
     for(int i=0;i<3;i++) {
  	   System.out.println("Int DataType :" +num[i]);
     }     
     String str[]=new String[3];
     str[0]="Kavita";
     str[1]="Krishna";
     str[2]="Anoor";
       for(int i=0;i<3;i++) {
    	   System.out.println("String DataType :" +str[i]);
       }    
     double num1[] =new double[3];
     num1[0]=10.20;
     num1[1]=20.30;
     num1[2]=30.50;
     for(int i=0;i<3;i++) {
  	   System.out.println("double DataType :" +num1[i]);
     }    
     long num2[] =new long[3];
     num2[0]=564433032;
     num2[1]=466783232;
     num2[2]=789798695;     
     for(int i=0;i<3;i++) {
  	   System.out.println("long DataType :" +num2[i]);
     }    
     float num3[] =new float[3];
     num3[0]=765656575;
     num3[1]=765656575;
     num3[2]=100008765;     
     for(int i=0;i<3;i++) {
  	   System.out.println("float DataType :" +num3[i]);
     }    
     boolean num4[] =new boolean[3];
     num4[0]=true;
     num4[1]=false;
     num4[2]=true;     
     for(int i=0;i<3;i++) {
  	   System.out.println("boolean DataType :" +num4[i]);
     }     
	}
}
