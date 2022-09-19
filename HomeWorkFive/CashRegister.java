package HomeWorkFive;

public class CashRegister {
    private int RAM;
    private int SSD;
    private int GPU;
    private int CPU;
    private int TV;
    private int mouse;
    private int kybd;
    private int Case;

    public CashRegister() {
        this.RAM = 100;
        this.SSD = 100;
        this.GPU = 300;
        this.CPU = 500;
        this.Case = 70;
        this.TV = 150;
        this.mouse = 50;
        this.kybd = 50;
    }
    
    public void  printReceipt(){
        String price = String.valueOf(this.RAM);
        price = price.concat(" + " + String.valueOf(this.SSD));
        price = price.concat(" + " + String.valueOf(this.CPU));
        price = price.concat(" + " + String.valueOf(this.GPU));
        price = price.concat(" + " + String.valueOf(this.Case));
        price = price.concat(" + " + String.valueOf(this.TV));
        price = price.concat(" + " + String.valueOf(this.kybd));
        price = price.concat(" + " + String.valueOf(this.mouse));
        System.out.println(price);
    }
}
