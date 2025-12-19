import java.util.Scanner;

public class E07_ForLookFaktöriyelŞekilŞukul {
    public static void main(String[] args) {
        //Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        // hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen 20 den küçük pozitif bir tamsayı giriniz...");
        int girilenSayı=scanner.nextInt();
        int çarpım=1;
     if (!(girilenSayı<20&&girilenSayı>0)){
         System.out.println("verdiğiniz sayının faktöriyeli yukarıdaki şarta göre hesaplamaz");
     }else {
         for (int i = 1; i <=girilenSayı ; i++) {
             çarpım*=i;

         }
         for (int i = girilenSayı; i <=1 ; i++) {
             System.out.println(
                     girilenSayı+"!"+" "+""
             );

         }
     }


































    }






















}
