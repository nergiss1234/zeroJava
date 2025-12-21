import java.util.Scanner;

public class E07_ForLookFaktöriyelŞekilŞukul {
    public static void main(String[] args) {
        //Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        // hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen 20 den küçük pozitif bir tamsayı giriniz...");
        int girilenSayı=scanner.nextInt();

     if (!(girilenSayı<20&&girilenSayı>0)){
         System.out.println("verdiğiniz sayının faktöriyeli yukarıdaki şarta göre hesaplamaz");
     }else {
         int çarpım=1;
         System.out.print(girilenSayı+"! =");

         for (int i = girilenSayı; i >=2 ; i++) {
             System.out.print(i+"*");
             çarpım*=i;

         }
         System.out.println("i"+"="+çarpım);



         }



         }
     }


























































