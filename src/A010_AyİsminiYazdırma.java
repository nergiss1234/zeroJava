import java.util.Scanner;

public class A010_AyİsminiYazdırma {


    public static void main(String[] args) {





        //Kullanicidan ay numarasini alip ay ismini yazdirin
        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen ay numarasını giriniz ....");
        int ayNumarası=scanner.nextInt();
        switch (ayNumarası){
            case 1 : System.out.println("ocak");
            break;
            case 2 : System.out.println("şubat");
            break;
            case 3 : System.out.println("mart");
            break;
            case 4 : System.out.println("nisan");
            break;
            case 5 : System.out.println("mayıs");
            break;
            case 6 : System.out.println("haziran");
            break;
            case 7 : System.out.println("temmuz");
            break;
            case 8 : System.out.println("ağustos");
            break;
            case 9 : System.out.println("eylül");
            break;
            case 10 : System.out.println("ekim");
            break;
            case 11: System.out.println("kasım");
            break;
            case 12: System.out.println("aralık");
            break;
            default:
                System.out.println("girilen numara hatalıdır");
        }























    }

























}
