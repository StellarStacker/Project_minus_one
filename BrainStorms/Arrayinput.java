//java program to get array input
import java.util.Scanner;

class Getip{
	Scanner sc;
	int arr[],n;
	public Getip(){
		sc=new Scanner(System.in);
		System.out.println("Enter the number of elements to be array : ");
		n=sc.nextInt();
		arr=new int[n];
	}
	void getinput(){
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter the "+(i+1)+"element");
			int ele=sc.nextInt();
			arr[i]=ele;
		}
		System.out.println("Array loaded successfully !");
	}
	void display(){
		for(int i:arr)
			System.out.println(arr);
	}
}
class Main{
	public static void main(String...a){
		Getip ob=new Getip();
		ob.getinput();
		ob.display();
	}
}
		