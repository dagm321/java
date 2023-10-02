import java.io.*;
import java.io.IOException;


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
    public void method1() throws IOException {
        try {
            int num = 10 / 0; // this is arithemtic error
            System.out.println(num);
        } catch(ArithmeticException e) {
            System.out.println("Error: some athimetic error happens");
        }
        // Null pointer exception
        try {
            String str = null;
            str.length();
          } catch (NullPointerException e) {
            System.out.println("Error: Null pointer exception");
          }
        
          //Fiie not found exception
        try {
        FileReader reader = new FileReader("my_file.txt");
        reader.close();
        } catch (FileNotFoundException e) {
        System.out.println("Error: File not found");
        }

        // Class not found 
        try {
            Class.forName("com.example.MyClass");
          } catch (ClassNotFoundException e) {
            System.out.println("Error: Class not found");
          }
        // ArrayIndex Outof bound
        try {
            int[] arr = new int[10];
            arr[10] = 10;
          } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
          }

        // multiple exception
        try {
            // code here
        } catch (ArithmeticException e) {

        } catch (ArrayIndexOutOfBoundsException e) {

        } catch (NullPointerException e) {
        
        }

        // general exception or ioexception
        try {
            //code here
        } catch(IOException e) {

        }

    }

    // used to create errors
    public void userage(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("error");
        } else {
            System.out.println("pass");
        }
    }

}
