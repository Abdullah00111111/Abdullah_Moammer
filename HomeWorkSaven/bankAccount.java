package HomeWorkSaven;

public class bankAccount {
    protected double balance;
    protected double fine;
    //private int counter = 4;
    
    bankAccount(){
        this.balance = 0;
        this.fine = 0;
    }
    
    bankAccount(int balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double getFine (){
        return this.fine;
    }
    public void addMoney(double balance){
        this.balance += balance;
    }
    
    public void disMoney(double balance){
        this.balance -= balance;
    }
}
