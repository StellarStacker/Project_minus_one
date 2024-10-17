import java.util.Scanner;
class Create{
    Scanner sc;
    int age;
    Bankaccount acc;
    String name,gender,branch,acc_type,bank_name;
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
            System.out.println("Enter the account type : ");
            acc_type=sc.nextLine();
            System.out.println("Enter the Bankname : ");
            bank_name=sc.nextLine();
            //push(age, name, age, branch, bank_name, acc_type);
            System.out.println("Account created successfully\n");
            Bankaccount ob=new Bankaccount();
            ob.setbalance(1000);
            //display(ob);
            }
    public void display( Object obj){
            if(obj instanceof Bankaccount){
            acc=(Bankaccount) obj;
            System.out.println("-".repeat(10)+"DISPLAY"+"-".repeat(10));
            System.out.println();
            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
            System.out.println("Gender : "+gender);
            System.out.println("Branch "+branch);
            System.out.println("Balance : "+acc.getbalance());
            System.out.println();
            System.out.println("-".repeat(10)+"-".repeat(10));
            }else  
                System.out.println("Invalid bankaccount type");
    }
    public Bankaccount getbankaccountobj(){
        return acc;
    }
    public Create getobject(){
        return this;

    } 
}
