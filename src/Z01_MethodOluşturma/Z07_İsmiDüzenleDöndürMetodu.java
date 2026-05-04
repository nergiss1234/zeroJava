package Z01_MethodOluşturma;

public class Z07_İsmiDüzenleDöndürMetodu {
    public static void main(String[] args) {
        //Verilen isim ve soyismi alip
//Isim ve soyısmi ilk harfleri buyuk diğer harfler kucuk olacak sekilde duzenleyip
//isim bosluk osy isim seklinde donduren metod olusturun

//input : isim : Ali soyisim: YILMAZ metod return Ali Yilmaz

String ad="Murat";
String soyAd="Topal;";
        System.out.println(ismiDüzenleDöndürMetodu(ad,soyAd));
         ad=ismiDüzenleDöndürMetodu(ad,soyAd);
        System.out.println(ad);










    }

public static String ismiDüzenleDöndürMetodu(String isim,String soyIsım){

String düzenlenmişIsim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" "
+ soyIsım.substring(0,1).toUpperCase()+soyIsım.substring(1).toUpperCase();
return düzenlenmişIsim;



}


















}
