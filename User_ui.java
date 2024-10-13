import java.util.Scanner;

class User_ui {
        Scanner sc;
        Create user;
        Bankaccount buser;
        boolean repeat=true;
        public User_ui(){
            sc=new Scanner(System.in);
        }
        public User_ui(Object user){
            if(user instanceof Create){
                this.user=(Create) user;
                buser=this.user.getbankaccountobj();
                System.out.println("Successfully recived bankaccount object");
                System.out.println(buser instanceof Bankaccount);
            }else
                System.out.println("User object not created properly");
        }
        public void create_account(){
                Create newuser=new Create();
                Create created_user=newuser.getobject();
                System.out.println(created_user.name);
                if(created_user!=null) {
                    User_ui user1=new User_ui(created_user);
                    System.out.println(" User created successfully ");
                } else
                    System.out.println("User not created properly");
        }
        public void menu(){
            while (repeat) {
                System.out.println("WELCOME TO MENU ");
                System.out.println("-----CHOICE LIST-----");
                System.out.println("1 CREATE ACCOUNT  ");
                System.out.println("2 DEPOSIT AMOUNT  ");
                System.out.println("3 WITHDRAW AMOUNT ");
                System.out.println("4 VIEW  BALANCE  ");
                System.out.println("5 EXIT");
                char choice=sc.nextLine().charAt(0);
                switch (choice) {
                    case '1':
                        create_account();
                        break;
                    case '2':
                        if(isBankaccountobj()){
                            System.out.println("Enter the amount to be deposited : ");
                            buser.deposit(sc.nextInt());   
                            break;
                        }else
                            System.out.println("Bankaccount object is null ");
                            break;
                    case '3':
                        //withdraw
                        break;
                    case '4':
                        
                    case '5':
                        repeat=false;
                        break;
                    default:
                        System.out.println(" Invalid Choice ! ");
                }
                //System.out.println("1 CREATE ACCOUNT  ");
                
            }
        }
        public boolean isBankaccountobj(){
                return this.buser!=null;
        }
        
}