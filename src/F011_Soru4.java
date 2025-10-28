import java.util.Scanner;

public class F011_Soru4 {
    public static void main(String[] args) {


      //  Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
//“Eskenar ucgen” yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen üçgenin kenar uzunluklarını giriniz ");

        int kenar1=scanner.nextInt();
        int kenar2=scanner.nextInt();
        int kenar3=scanner.nextInt();


        if(kenar1==kenar2){


            if(kenar1==kenar3){

                System.out.println("verilen kenar uzunluklarına göre üçgen eşkenardır");

            }
            System.out.println("verilen kenar uzunluklarına göre üçgen eşkenar DEĞİLDİR");

        }





















    }

























}
