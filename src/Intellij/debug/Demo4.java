package Intellij.debug;

public class Demo4 {


    public static void main(String[] args) {

        /*
        important note if we put breakpoint on a line of code that never hits
        we will never enter debug mode
         */
        int age=10;
        String name="Chen";
        boolean student=true;

        if(student){
            if(age<18){
                System.out.println("Time to learn");
                if(name.equals("Chen")){
                    System.out.println("Hi Chen welcome to java Debugging");
                }else {
                    System.out.println("Hi There");
                }
            }else {
                System.out.println("Time to earn");
            }
        }else {
            System.out.println("You needs to be a student");
        }



    }
}
