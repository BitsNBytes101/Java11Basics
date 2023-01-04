package tutorial013;

public class NestedIfDemo2 {
    public static void main(String[] args) {

        boolean isMedicineAvailable=false;
        boolean isFuelEnough=true;
        if(isMedicineAvailable){

            if(isFuelEnough){
                System.out.println("Lets  get the medicine");
            }else {
                System.out.println("Lets refill the car first");
            }
        }




    }
}
