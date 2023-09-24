public class Exceptions {
    public void method() {
        try { // The try statement allows you to define a block of code to be tested for errors while it is being executed.
            int[] nums = {1, 2, 3};
            System.out.println(nums[10]);
        } catch(Exception e) { // The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
            System.out.println("something went wrong");
        } finally { // The finally statement lets you execute code, after try...catch, regardless of the result:
            System.out.println("what ever it is this code will be excute");
        }
    }

    // Arthimatic Exception
    public void method1() {
        try {
            int num = 10 / 0; // this is arithemtic error
            System.out.println(num);
        } catch(ArithmeticException e) {
            System.out.println("Error: some athimetic error happens");
        }
    }

    // Null pointer Exception

    
    public void userage(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("error");
        } else {
            System.out.println("pass");
            
        }
    }




    public static void main(String[] args) {

    }

}
