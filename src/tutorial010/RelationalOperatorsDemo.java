package tutorial010;

public class RelationalOperatorsDemo {
    public static void main(String[] args) {
        System.out.println("************");
        //below we are checking if 10 is equal to 20 as it is not we get a false
        System.out.println(10==20); //false
        System.out.println(20==20); //true
        //below we are checking if 10 is NOT equal to 20 as it is not equal we get a true
        System.out.println(10!=20); //true
        //below we are checking if 10 greater than 20 as it is not  we get a false
        System.out.println(10>20); // false
        //below we are checking if 10 less than 20 as it is   we get a true
        System.out.println(10<20);  // true
        //below we are checking if 10 is greater than 20 or equal to 20 as non of the condition is true
        // we get a false
        System.out.println(10>=20);  // false
        System.out.println(10>=10);  // true
        System.out.println(11>=10);  // true
        //below we are checking if 10 is less than 20 or equal to 20 as one of the condition is true
        // we get a true
        System.out.println(10<=20);  // true
    }
}
