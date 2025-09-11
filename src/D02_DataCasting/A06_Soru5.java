package D02_DataCasting;

import java.util.Scanner;

public class A06_Soru5 {
    public static void main(String[] args) {

        // Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
        //ve bolum isleminin sonucununun tamsayi kismini yazdirin.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir adet ondalıklı ve bir adet tam sayı giriniz : " ) ;

        double girilenSayı1=scanner.nextDouble();
        int girilenSayı2=scanner.nextInt();

        int ikiSayınınBolumu=(int)(girilenSayı1/girilenSayı2);
        System.out.println("İki sayının bolumu: "+ikiSayınınBolumu);





























    }

























}
