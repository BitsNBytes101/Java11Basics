package tutorial005;

public class CommentsDemo {
    public static void main(String[] args) {
        int salary=100000; // Annual salary
        double bonus=0.10; // annual bonus 10% on gross salary
        int houseRentAllowance=20000; // annualHouseRentAllowance
        double tax =0.30; // annual Tax 30%

        /*
        1) Calculating total of salary and allowance =salary+houseRentAllowance)
        2)calculating bonus on total amount and adding it to calculate the
        income before tax (salary+houseRentAllowance)*(1+bonus)
        calculating (tax gross income)* (1-tax)
         */
        double salaryAfterTax=(salary+houseRentAllowance)*(1+bonus)*(1-tax);
        System.out.println(salaryAfterTax);


    }
}
