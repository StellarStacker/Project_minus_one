class Main{
     public static void main(String[] args) {
        Create user1=new Create();
        Bankaccount obj=user1.getobject();
        obj.deposit(1000);
        obj.checkbalance();
    }   
}