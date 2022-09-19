package HomeWorkFive;

public class Main {
    public static void main(String[] args) {
        // Question Three ----------------------------------
        BankAccount Q_Three = new BankAccount();
        // Question Three ----------------------------------
        
        // Question Four -----------------------------------
        BankAccount Q_Four = new BankAccount(1000);
        System.out.println("Q_Four = " + Q_Four.addinterest(50));
        // Question Four -----------------------------------
        
        // Question Five -----------------------------------
        BankAccount Q_Five = new BankAccount();
        Q_Five.mystery(Q_Four, 50);
        // Question Five -----------------------------------
        
        // Question Eight ----------------------------------
        BankAccount Q_Eight = new BankAccount(1000);
        Q_Eight.addinterest(10);
        Q_Eight.addinterest(10);
        System.out.println(Q_Eight.addinterest(10));
        System.out.println(Q_Eight.addinterest(10));
        // Question Eight ----------------------------------
        
        // Question Nine -----------------------------------
        CashRegister Q_Nine = new CashRegister();
        Q_Nine.printReceipt();
        // Question Nine -----------------------------------
        
        // Question Ten ------------------------------------
        Employee Q_Ten = new Employee();
        System.out.println(Q_Ten.setPercentage());
        // Question Ten ------------------------------------
    }
}
