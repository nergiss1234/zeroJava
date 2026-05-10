package Z01_MethodOluşturma;

import java.util.Scanner;

public class Z012_DoğruŞifreAlma {

    public static void main(String[] args) {
        // Kullanıcıdan bir sifre isteyin
// C10 daki metodu kullanarak sifreyi kontrol edin
// ve sifre uygun oluncaya kadar islemi tekrar edin,
// sifre uygun oldugunda kac denemede uygun sifre yazabildigini söyleyin

        // Kullanıcıdan bir sifre isteyin

  Scanner scanner=new Scanner(System.in);
  String şifre;
  int sayaç=0;
  boolean şifreGeçerliMi=false;
        for (int i = 1; i <10000 ; i++) {
            System.out.println("lütfen bir şifre giriniz");
            şifre=scanner.nextLine();
            şifreGeçerliMi=Z011_ŞifreKontrol.şifreDoğruMuKontrol(şifre);
            if (şifreGeçerliMi==true){
                System.out.println(" doğru şifreyi girdiniz");
                break;
            }

        }
















    }
























}
