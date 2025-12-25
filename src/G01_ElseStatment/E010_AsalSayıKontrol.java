package G01_ElseStatment;

import java.util.Scanner;

public class E010_AsalSayıKontrol {

    public static void main(String[] args) {
        //Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
       //kontrol edin ve sonucu yazdirin.
        Scanner scanner =new Scanner(System.in);
        System.out.println("lütfen pozitif bir tam sayı giriniz .....");
        int girilenSayı=scanner.nextInt();
        int sayaç=0;

        for (int i = 1; i <=girilenSayı ; i++) {


            if (girilenSayı%i==0){
                sayaç++;
            }

        }
        if (sayaç==2){
            System.out.println(girilenSayı+"sayı asaldır");
        }else System.out.println(girilenSayı+"sayısı asal değildir...");

























    }


























}
