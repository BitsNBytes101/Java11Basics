package tutorial011;

public class IfDemoWithRelationalOperators {
    public static void main(String[] args) {

        int bankBalance=200;
        System.out.println(bankBalance>1000);
        if(bankBalance>1000){
            System.out.println("Lets buy an Iphone");
        }

        String day="Sunday";
        System.out.println(day.equals("Sunday"));
        if(day.equals("Sunday")){
            System.out.println("Lets go shopping");
        }


    }
}
