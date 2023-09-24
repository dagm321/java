// import arraylist package
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        // declaration of arraylist
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<Integer> age = new ArrayList<Integer>();
        //add items into it
        age.add(2);
        age.add(2);
        name.add("dag");
        //access items
        age.get(0);
        name.get(0);
        // remove items
        age.remove(0);
        name.remove(0);
        // array size
        age.size();

        // looooops
        for (int i = 0; i < age.size(); i++) {
            System.out.println(age.get(i));
        }
        for (int i: age) {
            System.out.println(age.get(i));
            
        }
        

    }
}
