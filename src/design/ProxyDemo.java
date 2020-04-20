package design;
interface Bank{

    // saari method  by default public hai

    void setBalance(int amount);
    void depositeMoney(int amount);
    void withdrawMoney(int amount);
    void getBalance();

}
class BankAccount implements Bank{
    private int amount;
    public void setBalance(int amount)
    {
        this.amount=amount;
    }
    public void depositeMoney(int amount)
    {
        this.amount=this.amount+amount;
    }
    public void withdrawMoney(int amount)
    {
        if((this.b.getBalance()-amount)<0)
        {
            System.out.println("Invalid ");
        }
    }
    public int getBalance(int amount)
    {
        return this.amount;
    }


}
public class ProxyDemo {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setBalance(10000);
        b.depositeMoney(50000);
        b.withdrawMoney(10000);
    }
}
