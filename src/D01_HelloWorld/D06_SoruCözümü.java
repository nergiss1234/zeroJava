package D01_HelloWorld;

import java.util.Scanner;

public class D06_SoruCözümü {
    public static void main(String[] args) {

       // Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
       // girilen bilgiler : J Doe, 44


        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen İsminizi Giriniz :");
        String girilenİsim=scanner.nextLine().substring(0,1);
        System.out.println("Lütfen Soyisminizi Giriniz :");
        String girilenSoyIsim=scanner.nextLine();
        System.out.println("Lütfen Yaşınızı Giriniz :");
        int girilenYas=scanner.nextInt();


        System.out.println("girilen bilgiler :"+girilenİsim+" "+girilenSoyIsim+" ,"+girilenYas);
        // Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        System.out.println("Lütfen Yarı Çapını Giriniz :");
        double girilenYarıÇap =scanner.nextDouble();
        double piSayısı =3.14;
        double daireninÇevresi =2*piSayısı*girilenYarıÇap;
















    }






}
