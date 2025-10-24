public class F07_AndVeAndOperatörü {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        System.out.println(a>b && b>0);//false
        System.out.println(a>=b-5 && a>b-8);//false

        boolean c;
        c =a>=b && 3*a<4*b ;

        System.out.println(c);//false
        System.out.println(a < b && b < 10 && b >= a && a < 0);//false
        System.out.println(a < b & b < 10 & b >= a && a < 0);//false


    }























}
