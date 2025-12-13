import java.util.Scanner;

public class K05_SubString {
    public static void main(String[] args) {
        // kullanicidan bir metin isteyin
// metin ev içeriyorsa "Ev gibisi var mi"
// metin iş içeriyorsA "Çalışmak ne güzel"
// metin hem ev hem iş içeriyorsa "Evden çalışmak gibisi yok"
// metin bu iki kelimeyi de içermiyorsa "Çok çalışmak lazim, çoook" yazdırın
        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz .....");
        String girilenMetin=scanner.nextLine();
        if(girilenMetin.contains("ev")&&girilenMetin.contains("iş")){
            System.out.println("çok çalışmak lazım ,çoook");

        }
        if (girilenMetin.contains("ev")){
            System.out.println("ev gibisi var mı");
        }
        if (girilenMetin.contains("iş")){
            System.out.println("evden çalışmak ne güzel");
        }
        if(girilenMetin.contains("iş ")&&girilenMetin.contains("ev")){
            System.out.println("evden çalışmak gibisi yok");
        }
     


























    }























}
