package HomeWorkFive;

public class BankAccount {
    private double Balance;
    private int counter = 4;
    
    
    BankAccount() {
        Balance = 1000;
        Balance -= 500;
        Balance -= 400;
        System.out.println("Q_Three = " + Balance + "\n");
        counter--;
    }
    
    BankAccount(int number){ 
        Balance = number;
        counter--;
    }
    
    public double addinterest(double Percentage){
        --counter;
        Balance += Balance * (Percentage/100);
        return (counter <= 0) ? Balance-- : Balance;
        
    }
    
    public void mystery(BankAccount that, double amount){
        this.Balance = this.Balance - amount;
        that.Balance = that.Balance + amount; 
        System.out.println("this = " + this.Balance + " that = " + that.Balance);
    }
    
    }
