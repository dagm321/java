public class Abstraction  extends Abstraction1 {
    // Abstraction is the process of hiding the implementation details of a system from the user and only exposing the functionality of the system
    // Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
    // Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
    // An abstract class can have both abstract and regular methods:

    // calling an abstract method and set value for it
    public void method() {
        System.out.println('c');
    }
    public static void main(String[] args) {
        // create an object from parent class
        Abstraction obj = new Abstraction();
        obj.method();
        
        obj.regularmethod();
    }

}
