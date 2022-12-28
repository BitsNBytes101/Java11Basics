package tutorial003;

public class VariablesDemo1 {
    public static void main(String[] args) {
        byte smallestWholeNumberBox=125;
        System.out.println(smallestWholeNumberBox);
        short mediumWholeNumberBox=1234;
        int largeWholeNumberBox=23344444;
        long extraLargeWholeNumberBox=3383838388383l; // need to place l at the end
        System.out.println(largeWholeNumberBox);


        float smallDecimalNumberBox=1.5f; // we have to use letter f at the end of float
        double someBigNumberBox=1233333.34444444; // can hold large decimal numbers
        System.out.println(someBigNumberBox);

        char charBox='M';
        System.out.println(charBox);

        boolean isHungry=true;
        boolean isSleepy=false;
        System.out.println(isSleepy);

        String address="street # 12 block number 1";

        int num1=10;
        int num2=10;
        System.out.println(num1+num2);
        String number1="10";
        String number2="10";
        System.out.println(number1+number2);

        int name=10;
       // String num1=30;

    }
}
