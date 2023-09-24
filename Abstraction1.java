abstract class Abstraction1 { // abstract class can not be used to create objects so we can not be able to create objets in this class
    public abstract void method(); // abstract method does not have a body the body must be implemented on inherited class (Abstraction.java)
    // we can create regular methods in abstract class
    public void regularmethod() {
        System.out.println("heyy"); 
    }
}
