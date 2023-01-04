package tutorial013;

public class NestedIfDemo4 {
    public static void main(String[] args) {
        int day = 1; //Assign a value to a variable

        boolean mood=false;

        if (day == 1) { // we compare two values
            System.out.println("Monday");  // If Block
        }
        if (day == 2) {
            System.out.println("Tuesday"); // else block
        }
        if (day == 3) {
            System.out.println("Wednesday");
        }
        if (day == 4) {
            System.out.println("Thursday");
        }
        if (day == 5) {
            System.out.println("Friday");
        }
        if (day == 6) {
            System.out.println("Saturday");
        }
        if (day == 7) {
            System.out.println("Sunday");
            if(mood){
                System.out.println("Lets go shopping");
            }else {
                System.out.println("Lets sleep");
            }
        }




    }
}
