import java.util.Scanner;

public class J013_SoruÇözmeSayaçYöntemi {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı isteyin
//girilen sayılara göre asagıdaki degerlendirmeleriyazdırın
        //1-sayi1<sayi2 ise "birinci  sayi daha kucuk"
        //2- sayi1 pozitif ise "birinci sayi sıfırdan buyuk"
        //3- sayi2 50 den buyuk ise "ikinci sayı 50 den buyuk"
        //4-sayi 5 ile bolunrbiliyorsa "ikinci  sayı 5 in tam kati"
        //5- eger konsolde yukarıdakilerin HICBIRI yazdırılmasa
        // "nasıl sayı sectiniz , hicbir sarti sağlamayor" yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen iki tamsayı giriniz");
        int girilenSayı1=scanner.nextInt();
        int girilenSayı2=scanner.nextInt();
        int sayaç=0;
        if (girilenSayı1<girilenSayı2){
            System.out.println("birinci sayı daha küçük");
            sayaç++;
            System.out.println(sayaç);
        }
     if (girilenSayı1>0){

         System.out.println("birinci sayı sıfırdan büyük");
         sayaç++;
     }
     if (girilenSayı2>50){
         System.out.println("sayı2 50 den büyük");
         sayaç++;
     }
     if (girilenSayı2%5==0){
         System.out.println("sayı2 5'e bölünebilen bir sayıdır");
         sayaç++;
     }
     if (sayaç==0){
         System.out.println("ya ne biçim seçtin hiç birine uymadı");

     }















    }


























}
