package A01_NestedİfElse;

import java.util.Scanner;

public class A02_NestedİfElse1 {
    public static void main(String[] args) {

//Kullanıcıdan cinsiyetini ve yasını alın
//Kadin,60 yas ve üzeri,Erkek 65 yas ve üzeri emekli olabilir
//Cinsiyet ve yasini dikkate alarak "Emekli Olabilirsin"
//veya "Emekli olamak için ... Yıldaha çalışman gerek" yazdırn
//kulanıcı E veya K disinda bir cinsiyet girerse
//veya 15 yasdan kucuk ve 80 yasdan buyuk yas girerse uyarın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi giriniz... Erkek için E kadın için K yazınız");
        char cinsiyet =scanner.next().toUpperCase().charAt(0);
        System.out.println("lütfen yaşınızı giriniz");
        int yaş=scanner.nextInt();
         if ((cinsiyet=='E'||cinsiyet=='K')){
             System.out.println("lütfen cinsiyetinizi doğru giriniz....");

         }else if (yaş<15||yaş>80){
             System.out.println("verilen yaş için emeklilik yaşı hesaplanamaz");
         }else if (cinsiyet=='E') {

             if (yaş >= 65) {
                 System.out.println("Emekli olabilirsiniz...");
             } else if (yaş < 65) {
                 System.out.println((65 - yaş) + "emekli olabilmek için yıl daha çalışmalısınız");


             }
         }else if (cinsiyet=='K') {

             if (yaş >= 60) {
                 System.out.println("Emekli olabilirsiniz...");
             } else if (yaş < 60) {
                 System.out.println((60 - yaş) + "emekli olabilmek için yıl daha çalışmalısınız");


             }













         }















    }




















}
