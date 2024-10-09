abstract class Parent{
	abstract void hello();
	abstract void world();
	void print(){
		System.out.println("Abstract method called");
	}
}
abstract class Child extends Parent{
	void hello(){
		System.out.println("Hello world");
	}
	abstract void world();		// if one method is not implemented and then ait should be abstract in the class mentioned..

}
class Subchild extends Child{		//only if all abstarct mehtods are implemented compilation error will not be thrown 
	void world(){
		System.out.println("world method called");
	}
}
class Main{
	public static void main(String...args){
		Subchild obj=new Subchild();
		obj.hello();
		obj.world();
		obj.print();
		//Parent ob=new Chid();
	}
	
}