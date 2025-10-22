package B03_RaperVeMatematikselİşlemler;

public class F05_Concatenation {
    public static void main(String[] args) {

        // Sadece verilen varaible'leri kullanarak String'leri elde edelim.
        String s1="Java";
        String s2=" ";
        String s3="kolay";
        String s4="";

        int a=3;
        int b=4;
        int c =a*b;
        int d=a+b;
        System.out.println(c+s2+s1+s2+s3);//12 Java kolay
        System.out.println(d+s2+s1+s2+s3);//7 Java kolay
        System.out.println(a+s4+b+s1+s2+s3);//34 Java kolay
        System.out.println(s1+c+s3);//Java12kolay
        System.out.println(s1+a+s4+b+s3);//Java34kolay
        System.out.println(s1+d+s3);//Java7kolay






















    }

























}
