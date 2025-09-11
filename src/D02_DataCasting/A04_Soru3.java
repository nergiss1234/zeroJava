package D02_DataCasting;

import java.util.Scanner;

public class A04_Soru3 {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        //ile 127 arasindaki bir sayiya donusturup yazdirin.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        double girilenSayı=scanner.nextDouble();


        byte sayı1=(byte) girilenSayı;
        System.out.println("Girilen sayının -128 ile 127 arasındaki değeri "+sayı1);

























    }





















}
