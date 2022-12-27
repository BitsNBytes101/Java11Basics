package shorthand.operator;

public class ShortHandDemo1 {
    public static void main(String[] args) {

        int myNumber=10; // give us a box of type int and put 10 in it
        /*
        pick the previous value which is 10 and add 10 more to that value
        so 10+10=20 now store these results back to variable myNumber
         */
        //myNumber=myNumber+10;
        myNumber+=10;

        System.out.println(myNumber);


        int myNumber2=10;
        myNumber2*=2;
        System.out.println(myNumber2);

        myNumber2/=4;
        System.out.println(myNumber2);
        myNumber2%=3;
        System.out.println(myNumber2);


    }
}
