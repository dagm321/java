public class Modifiers {
    // access modifiers are :
    //   - private = code is accessable only within declared classes
    //   - public = code is accessable for all classes
    //   - protected = accessable in same package and subclasses
    //   - default = code is accessable only same package


    // non-access modifiers are:
    //    - static = Attributes and methods belongs to the class, rather than an object
    //    - final = Attributes and methods cannot be overridden/modified
    //    - abstract = Can only be used in an abstract class, and can only be used on methods. The method does not have a body


    public int number = 2; // to access public methods or attributes we must create an object
    static int num = 1;  // we can access static methods or attributes without creating an object
    protected int nums = 3; // it is private but we can access this attribute in another class / but we must create an object for access protected attributes

    public static void main(String[] args) {

        // accessing static attribute
        System.out.println(num);

        //accessing public attributes
        Modifiers name = new Modifiers();
        System.out.println(name.number);
        

    }

}
