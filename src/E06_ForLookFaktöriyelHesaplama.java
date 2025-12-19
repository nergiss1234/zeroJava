import java.util.Scanner;

public class E06_ForLookFaktöriyelHesaplama {
    public static void main(String[] args) {
       // Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen 20 den küçük pozitif bir tamsayı giriniz...");
        int girilenSayı=scanner.nextInt();
        int çarpım=1;
        if (!(girilenSayı<20&&girilenSayı>0)){
            System.out.println("verdiğiniz sayının faktöriyeli hesaplanamaz");
        }else {
            for (int i = 1; i <=girilenSayı ; i++) {
               çarpım*=i;

            }
            System.out.println(girilenSayı+"nın faktöriyeli"+çarpım+"dır");
        }


































    }

























}
