public class ClassObjects {
    private int balance;

    public ClassObjects(int balance) {
        this.balance = balance;
    }
    public void setbalance(int balance) {
        this.balance = balance;
    }
    public int getbalance() {
        return balance;
    }
    public static void main(String[] args) {
        ClassObjects name = new ClassObjects(0);
        int bala = 10;
        name.setbalance(bala);
        System.out.println(name.getbalance());
        
    }
}
