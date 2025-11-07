import java.util.Scanner;

public class G02_EşkenarÜçgen {
    public static void main(String[] args) {
        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, kenar uzunlukları birbirine eşitse
//“Eskenar ucgen” yazdirin.
//değilse üçgen eşkenar üçden değildir yazdırn
        Scanner scanner=new Scanner(System.in);
        int kenar1=scanner.nextInt();
        int kenar2=scanner.nextInt();
        int kenar3=scanner.nextInt();

        if (kenar1==kenar2&&kenar1==kenar3&&kenar1>0){
            System.out.println("verilen kenar uzunluklarına göre üçgen eşkenar üçgendir");

        } else System.out.println("verilen kenar uzunlukların birbirine eşit olmadığından üçgen eşkenar değildir");
















    }

























}
