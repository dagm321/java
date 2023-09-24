public class Encapsulation {
    // Encapsulation is make sure sensetive data hidden from the user
    // to achieve this you must:
        //  declared variables or methods  as private
        // provide public get and set methods to access and update the value of a private variable

    private int balance;

    // setter
    public void setbalance(int balance) {
        this.balance = balance;
    }

    // getter
    public int getbalance() {
        return balance;
    }
    public static void main(String[] args) {
        Encapsulation objectname = new Encapsulation();
        int userbalance = 220;
        objectname.setbalance(userbalance);
        objectname.getbalance();
    }
}
