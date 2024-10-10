//Java program to find the factorial of a number 

import java.util.Scanner;
class Fact{
	int fact=1,i=1;
	public int find(int n){	
		while(i<=n){
			fact*=i;
			i++;
		}
		return fact;
	}
}
class Main{
	public static void main(String...args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n : ");
		int f=sc.nextInt();
		Fact ob=new Fact();
		int res=ob.find(f);
		System.out.println("The factorial of "+f+" is "+res);
	}
}
		