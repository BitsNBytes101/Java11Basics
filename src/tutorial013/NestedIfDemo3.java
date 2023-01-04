package tutorial013;

public class NestedIfDemo3 {
    public static void main(String[] args) {

        boolean isMedicineAvailable=true;
        boolean isFuelEnough=false;
        int cityDistance=130;
        if(isMedicineAvailable){

            if(isFuelEnough){
                System.out.println("Lets go get the medicine");
            }else {
                System.out.println("Lets refill the car first");

                if(cityDistance<200){
                    System.out.println("Lets refill half of the tank");
                }else {
                    System.out.println("Lets refill full tank");
                }
                System.out.println("Lets go get the medicine");
            }
        }




    }
}
