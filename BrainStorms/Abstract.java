abstract class A{
	abstract void print();
}
class B extends A{
	void print(){

		System.out.println("Hello world");
	}
}
class Run{
	public static void main(String args[]){
	
	B ob=new B();
	ob.print();
	}
}