package D02_DataCasting.A02_1;

import java.util.Scanner;

public class A03_Soru2 {
    public static void main(String[] args) {
   //Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin
 Scanner scanner=new Scanner(System.in) ;
        System.out.println("Lütfen bir harf giriniz ...");
        char girilenHarf=scanner.nextLine().charAt(0);
        //girilen harf a,b,c,d
        char sonrakiIlkHarf =(char) (girilenHarf+1);
        char sonrakiİkinciHarf =(char) (girilenHarf+2);
        char sonrakÜçüncüHarf =(char) (girilenHarf+3);

        System.out.println("Girilen harften sonraki ilk 3 harf "+sonrakiIlkHarf+" "+sonrakiİkinciHarf+" "+sonrakÜçüncüHarf);
























    }

























}
