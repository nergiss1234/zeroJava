package D02_DataCasting;

import java.util.Scanner;

public class A05_Soru5 {
    public static void main(String[] args) {
        // Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
//isleminin sonucununun tamsayi kismini yazdirin.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen iki adet ondalıklı sayı giriniz : ");

        double girilenSayı1=scanner.nextDouble();
        double girilenSayı2=scanner.nextDouble();

        int sayılarınBölümü=(int) (girilenSayı1/girilenSayı2);
        System.out.println("İki sayının bolümlerinin tam sayı sonucu : "+sayılarınBölümü);






















    }
























}
