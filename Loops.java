public class Loops {
    public static void main(String args[]) {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 15; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }

        // whlie loop code goes here

        int number = 10;
        int result = 0;
        while(number > 0) {
            number = number / 10;
            result = result + 1;
        }
        System.out.println(result);

        // for each loop
        String[] cars = {"bmw", "marcedes", "vols"};
        for (String i : cars) {
            System.out.println(i);
            System.out.println("h");
        } 


    }
}
