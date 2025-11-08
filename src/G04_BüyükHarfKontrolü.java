import java.util.Scanner;

public class G04_BüyükHarfKontrolü {

    public static void main(String[] args) {

        /*

Kullanicidan bir harf girmesini isteyin
girilen harfin buyuk yada kucuk oldugunu yazdirin


 */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char girilenHarf=scanner.next().charAt(0);

        if (girilenHarf>='A'&&girilenHarf<='Z'){
            System.out.println("girdiğiniz harf büyük harftir");

        }else System.out.println("girdiğiniz harf küçük harftir");
     if (Character.isUpperCase(girilenHarf)){
         System.out.println("girilen harf büyüktür");
     }else System.out.println("girilen harf küçüktür");






















    }
























}
