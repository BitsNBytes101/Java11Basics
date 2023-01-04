package Intellij.debug;

public class Demo3 {
    public static void main(String[] args) {

        int salary=100000;
        double bonus=0.10;
        int houseRentAllowance=20000;
        double tax =0.30;

        double salaryAfterTax=(salary+houseRentAllowance)*(1+bonus)*(1-tax);
        System.out.println(salaryAfterTax);
    }
}
