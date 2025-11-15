import java.util.Scanner;

public class A07_Üçgen {

    public static void main(String[] args) {

        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
//“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen üçgenin kenar uzunluklarını giriniz");
        int kenar1=scanner.nextInt();
        int kenar2=scanner.nextInt();
        int kenar3=scanner.nextInt();

        System.out.println(kenar1==kenar2&&kenar1==kenar3 ? "eşkenar üçgendir":"eşkenar üçgen değildir");
























    }

















}
