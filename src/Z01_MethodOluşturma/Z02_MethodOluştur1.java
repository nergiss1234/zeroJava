package Z01_MethodOluşturma;

public class Z02_MethodOluştur1 {
    public static void main(String[] args) {
        /*
       Kullanıcıdan alinan bir metinden
       kullanicinin girdigi baslangic ve bitis indexleri arasindaki kısmı yazıdırn

       Kurallar:
       1-eger baslangic veya bitis index i negatif veya metin sinirleri dısında ise hataverin
       2-baslangic index'i bitis index inden buyukse hata mesaji verin
       3-baslangic indexindeki karakter dahil, bitis indexindeki karakter haric olamlıdır

        */
 String girilenİfade="hayat çalışınlara güzel...";
 int başlangıçIndex=2;
 int bitişIndex=4;

 if(başlangıçIndex<0||bitişIndex<0||başlangıçIndex>=girilenİfade.length()||başlangıçIndex>=girilenİfade.length()){
     System.out.println("verilen değerler hatalı ....");
 } else if (başlangıçIndex>bitişIndex) {
     System.out.println("başlangıç ındex bitiş indexsinden büyük olamaz angut ....");

 }else {

     for (int i = başlangıçIndex; i <bitişIndex ; i++) {
         System.out.print(girilenİfade.charAt(i));

     }




 }


    }




















}
