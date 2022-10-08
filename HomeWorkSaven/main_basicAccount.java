package HomeWorkSaven;

public class main_basicAccount {
    public static void main(String[] args) {
        basicAccount ob = new basicAccount();
        
        ob.addMoney(0);
        ob.Q_One_Q_Tow(1000);
        System.out.println("your balance = " + ob.getBalance() + "\nyour fine = " + ob.getFine());
    }
}
