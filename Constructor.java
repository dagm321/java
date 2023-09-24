public class Constructor {
    private int balance;

    public Constructor(int balance) {
        this.balance = balance;
    }
    public void setbalance(int balance) {
        this.balance = balance;
    }
    public int getbalance() {
        return balance;
    }
    public static void main(String[] args) {
        Constructor name = new Constructor(0);
        int b = 12;
        name.setbalance(b);
        System.out.println(name.getbalance());
        
    }
}