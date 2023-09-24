import java.util.Scanner;
public class Ifelse {
    private int balance;
    public Ifelse(int balance) {
        this.balance = balance;
    }
    public void setbalance(int balance) {
        this.balance = balance;
    }
    public int getbalance() {
        return this.balance;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Ifelse name = new Ifelse(0);
        System.out.print("enter your number: ");
        int inp = scanner.nextInt();
        name.setbalance(inp);
        if (name.getbalance() < 10) {
            System.out.println("less");
        } else if(name.getbalance() > 10) {
            System.out.println("high");
        } else {
            System.out.println("equal");
        }
        scanner.close();
        

    }
}
