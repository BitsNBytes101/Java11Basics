package typecasting;

public class TypeCastingDemo {
    public static void main(String[] args) {

        byte xsBox=123; // extra small Box
        short sBox=2345; // small Box
        int mBox=23356666; // medium box
        long lBox=223345554444l; // large box

        float xlBox=233222223322.333f; // extra large box
        double xxlBox=33332222233322.2222233; //extra extra large box

        mBox=xsBox; //123
        System.out.println(mBox);

        mBox=2222222;
        sBox=(short) mBox;
        System.out.println(sBox);
        int f=34;
        double c=(34-32)*5.0/9.0;
        System.out.println(c);
        System.out.println((int)c);



    }
}
