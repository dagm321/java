public class Inheritance extends Modifiers {

    // inheritance is inherit methods and attributes from another class using extends key word
    // "inheritance concept" into two categories:
    //     subclass (child) - the class that inherits from another class
    //     superclass (parent) - the class being inherited from
    public static void main(String[] args) {
        // access attributes of another class

        //access static attribute
        System.out.println(num);

        // access public and protected attribute 
        Modifiers obj = new Modifiers();
        System.out.println(obj.number);
        //access protected attribute
        System.out.println(obj.nums);
        System.out.println("h");
    }
}
