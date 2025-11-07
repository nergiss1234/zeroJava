import java.util.Scanner;

public class J014_SoruÇözümüFlabYöntemi {
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
        int flag=13;
        if (girilenSayı1<girilenSayı2){
            System.out.println("birinci sayı daha küçük");
            flag=42;

        }
        if (girilenSayı1>0){

            System.out.println("birinci sayı sıfırdan büyük");
            flag=42;
        }
        if (girilenSayı2>50){
            System.out.println("sayı2 50 den büyük");
            flag=42;
        }
        if (girilenSayı2%5==0){
            System.out.println("sayı2 5'e bölünebilen bir sayıdır");
            flag=42;
        }
        if (flag==13){
            System.out.println("ya ne biçim seçtin hiç birine uymadı");

        }







































    }






















}
