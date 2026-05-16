package K016_WhileLoop;

public class K017_WhileLoop {
    public static void main(String[] args) {
    //eğer başlangıç ve bitiş değeri biliniyorsa
        //veya bir işlemi kaç defa tekrarlayacağımızı
        //biliyorsak for lop avantajlıdır çünkü while
        //başlangıç değeri ve bitiş değeri ve artiş/azalış
        //miktarını bize olarak vermez


        //1 den 10 a kadar (1 ve 10dahil) tüm sayıları
        //toplayınız....


sayılarArasınıTopla(2,3);
sayılarArasınıTopla(1,55);
//aynısını while loop ile yapalım
        int toplam=0;
int sayı=1;
while (sayı<=10){
    toplam+=sayı;
    sayı++;

}
        System.out.println("while loop sonuç"+toplam);
//20 den 30 a kadar olan çift sayıların toplamını bulunuz
        int toplam1=0;
        for (int i = 20; i <=30 ; i++) {
            if (i%2==0){
                toplam1+=i;

            }
            System.out.println("20 ila 30 arasındaki sayıları toplamı:"+toplam1);
        }
   int sayi1=20;
        int toplam2=0;
        while (sayi1<=30){
            if (sayi1%2==0){
                toplam2+=sayi1;
                sayi1++;
            }
            System.out.println("while loop ile 20 30 arası toplam"+toplam2);
        }




    }

 public static void sayılarArasınıTopla(int sayı1,int sayı2){

   int toplam=0;
     for (int i = sayı1; i <=sayı2; i++) {
         toplam+=i;


     }
     System.out.println(sayı1+"den"+sayı2+"ye kadar sayıları topla"+toplam);












 }









}
