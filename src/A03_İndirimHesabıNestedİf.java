import java.util.Scanner;

public class A03_İndirimHesabıNestedİf {
    public static void main(String[] args) {
        //Kullanicidan aldıgı urun adedini ve indirimsiz fiyatını alin
// kullaniciya musteri kartı olup olmadıgını sorun
// musteri kartı varsa 10 urunden fazla alırsa %20
//                                az alırsA %15 İNDİRİM YAPIN
//Musteri kartı yoksa 10 urunden fazla alırsa %15
// az alırsa %10 indirim yapın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen aldığınız ürün adedini giriniz....");
        int ürünAdedi=scanner.nextInt();
        System.out.println("Sayın müşteri üyeli kartınız Varsa V yoksa Y yi tuşlayınız");
        char kartDurumu=scanner.next().toUpperCase().charAt(0);
        System.out.println("ürün fiyatını giriniz ....");
        double urunFiyatı=scanner.nextDouble();


        if (kartDurumu=='V'){
           if (ürünAdedi>=10){
               System.out.println(ürünAdedi*urunFiyatı*0.80);

           }else if (ürünAdedi<=10&&ürünAdedi>0){
               System.out.println(ürünAdedi*urunFiyatı*0.85);//%15 indirim ile
           }else System.out.println("ürün adedi eksik olamaz lütfen bilgilerinizi doğru giriniz...");



        }else if (kartDurumu=='Y'){
                if (ürünAdedi>=10){
                    System.out.println(ürünAdedi*urunFiyatı*0.85);//%15indirim ile

                }else if (ürünAdedi<=10&&ürünAdedi>0){
                    System.out.println(ürünAdedi*urunFiyatı*0.90);//%10 indirim ile
                }else System.out.println("ürün adedi eksik olamaz lütfen bilgilerinizi doğru giriniz...");


        }else System.out.println("Hatalı bilgi verdiniz");
























    }






















}
