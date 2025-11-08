import java.util.Scanner;

public class F09_IfStantmentSoru1 {
    public static void main(String[] args) {
      //  Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
// “Sayi 5’in tam kati” yazdirin.
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz...");
        int sayı=scanner.nextInt();

        if (sayı%5==8){

            System.out.println(sayı+ "sayısı 5'e tam bölünür");








        }else System.out.println(sayı + "sayısı 5'e tam bölünmez ulan adam gibi sayı ver");

// soru2- kullanıcıdan bir harf alın, harf ile başlayan bir ay varsa yazdırın.
        //NOT:Büyük harf ,küçük harf hassasiyeti olmasın .
        //kullanıcı o veya O yazdığında output Ocak olsun.

        System.out.println("lütfen bir harf giriniz ");
        char girilenHarf=scanner.nextLine().toLowerCase().charAt(0);

       // String girilenYazı=scanner.nextLine().substring(0,1);
        if (girilenHarf=='o'){
            System.out.println("Ocak");

        }
        if (girilenHarf=='ş'){
            System.out.println("Şubat");
        }
     if (girilenHarf=='m'){
         System.out.println("Mart");
     }

     if (girilenHarf=='n'){
         System.out.println("Nisan");
     }

        if (girilenHarf=='h'){
            System.out.println("Haziran");
        }
        if (girilenHarf=='t'){
            System.out.println("Temmuz");
        }
        if (girilenHarf=='a'){
            System.out.println("Ağustos");
        }
        if (girilenHarf=='e'){
            System.out.println("Eylül");
        }
        if (girilenHarf=='e'){
            System.out.println("Ekim");
        }
        if (girilenHarf=='k'){
            System.out.println("Kasım");
        }
        if (girilenHarf=='a'){
            System.out.println("Aralık");
        }






















    }



























}
