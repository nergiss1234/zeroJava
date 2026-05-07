package Z01_MethodOluşturma;

public class Z011_ŞifreKontrol {
    public static void main(String[] args) {
        //Soru 4: verilen sifre icin
// asagidaki sartlari gereken tum eksiklikleri YAZDIRAN
//tum sartlar kontrol edildikten sonra
//sifrede hata YOKSA true, VARSA false donduren
// bir metod olusturun

//-ilk kucuk olamlı
// son karakter rakam olmalı
//sifre boslu icermemeli
//uzunlugu en az 10 karakter olmalı
        System.out.println(şifreDoğruMuKontrol("abcd "));
        System.out.println(şifreDoğruMuKontrol("abcd1234566"));

    }
public static boolean şifreDoğruMuKontrol(String şifre){
        int sayaç=0;
 // -ilk kucuk olmalı
 char ilkKarakter=şifre.charAt(0);
 if (Character.isLowerCase(ilkKarakter)){
     System.out.println("hey dostum girdiğin şifrenin ilk karakteri küçük harf olmalı");
     sayaç++;
 }
 // son karakter rakam olmalı
    char sonKrakter=şifre.charAt(şifre.length()-1);
 if (Character.isDigit(sonKrakter)){
     System.out.println("hey moruk son karakter rakam olmalı");
     sayaç++;
 }
 //sifre boşluk içermemeli
    if (şifre.contains(" ")){
        System.out.println("hey zalazingo şifre boşluk içermemeli");
        sayaç++;
    }
 // uzunluğu en az 10 karakter olmalı
    if ( !(şifre.length()>10)){
        System.out.println("hey zirzok şifre en az 10 karakter olmalı ");
        sayaç++;
    }
  if (sayaç==0){
      return true;
  }else {
      return false;
  }














}






















}
