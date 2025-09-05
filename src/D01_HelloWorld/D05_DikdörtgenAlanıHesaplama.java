package D01_HelloWorld;

import java.util.Scanner;

public class D05_DikdörtgenAlanıHesaplama {
    public static void main(String[] args) {
       // Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini
       // yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Kısa Kenar Uzunluğunu Giriniz ....");
        int kısaKenarUzunluğu =scanner.nextInt();

        System.out.println("Lütfen Uzun Kenar Uzunluğunu Giriniz ....");
        int uzunKenarUzunluğu =scanner.nextInt();

        int dikdörtgeninAlanı =kısaKenarUzunluğu*uzunKenarUzunluğu ;

        System.out.println("Diktörgenin Alanı "+ dikdörtgeninAlanı+ " cm karedir" );



















    }




















}
