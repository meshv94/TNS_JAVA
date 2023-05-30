package tnsJava;


public class Acc_info {
	
	private String name;
    private int number;
    private int balance;

    public void setData(String n, int nb, int bl){
        name = n;
        number = nb;
        balance = bl;
    }

    public void getData(){
        System.out.println("Name : "+name);
        System.out.println("Acc no : "+number);
        System.out.println("Balance : "+balance);
    }

    public void withdraw(int amount){
        int n_balance = balance - amount;
        if(n_balance < 1000){
            System.out.println("Not enough balance in your account");
        }
        else{
            balance = n_balance;
            System.out.println("remaining balance :" + balance);
        }
    }

    public void deposit(int amount){
        balance = balance + amount;
        System.out.println("Depositing money...");
        System.out.println("balance : "+balance);
    }
}
