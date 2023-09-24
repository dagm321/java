public class Array {
    public static void main(String[] args) {
        // declear arrays
        int[] nums = {1, 3, 5, 6};
        
        String[] let = {"car", "tab", "carrr" };
        // array length
        System.out.println(let.length);
        //change or access specific array
        System.out.println(let[0]);
        let[1] = "dag";

        // array loop
        for (int i: nums){
            System.out.println(i);
        }
        // another type of loop
        for (int i = 0; i < let.length; i++) {
            System.out.println(let[i]);
        }
    }
}
