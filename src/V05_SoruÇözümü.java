import java.util.Scanner;

public class V05_SoruÇözümü {
    public static void main(String[] args) {
        // kullanıcıdan şifre oluşturmak üzere sifre isteyin
// sifreyi iki kere isteyin
// eger metin  aynı oldugu halde yazım farklılıgı varsa
// "Lütfen yazimi kontrol edin "yazdırın...
//  Eger karakter farkliliği varsa
// "Girilen sifreler farkli" yazdirin
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen şifre giriniz");
        String şifre=scanner.nextLine();
        System.out.println("lütsen şifrenizi tekrar giriniz");
        String yeniŞifre=scanner.nextLine();
        if (!şifre.equals(yeniŞifre)){
            System.out.println("girilen şifreler farklı");
        }
        if (!şifre.equalsIgnoreCase(yeniŞifre)){
            System.out.println("lütfen yazımı kontrol edin");
        }

































    }































}
