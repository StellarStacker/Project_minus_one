import java.util.Scanner;
class Create {
    Scanner sc;
    int age;
    String name,gender,branch;
    public Create(){
            sc=new Scanner(System.in);
            System.out.println("Enter Your Name : ");
            name=sc.nextLine();
            System.out.println("Enter Your Age : ");
            age=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Your Gender : ");
            gender=sc.nextLine();
            System.out.println("Enter Your branch : ");
            branch=sc.nextLine();
            System.out.println("Input validated");
            Bankaccount ob=new Bankaccount(1000);
            display(ob);
            }
    public void display(Object obj){
            if(obj instanceof Bankaccount){
            Bankaccount acc=(Bankaccount) obj;
            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
            System.out.println("Gender : "+gender);
            System.out.println("Branch "+branch);
            System.out.println("Balance : "+acc.getbalance());
            }else  
                System.out.println("Invalid bankaccount type");
    }
    public static void main(String[] args) {
        Create user1=new Create();
    }    
}
