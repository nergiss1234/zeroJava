import java.util.Scanner;

public class F010_ÜçİleBölüneBilme {
    public static void main(String[] args) {
       // Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        //sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.
Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz ");
        int verilenSayı=scanner .nextInt();

        if(verilenSayı%3==0){


            System.out.println("kullanıcının verdiği " +verilenSayı + "sayısı üç ile bölünebilir");
        }
if (verilenSayı%5==0){

    System.out.println("kullanıcının verdiği " +verilenSayı+ "sayı beş ile bölünebilir");



}





















    }



























}
