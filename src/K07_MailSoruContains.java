import java.util.Scanner;

public class K07_MailSoruContains {
    public static void main(String[] args) {
/*
        SORU : kullanicidan bir mail alin
         - mail @ icermiyorsa "gecersiz mail"
                - mail @gmail.com icermiyorsa, "mail gmail olmali"
                - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
        yazdirin.

       */
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir mail giriniz ...");
        String girilenMetin=scanner.nextLine();
        if (!girilenMetin.contains("@")){
            System.out.println("geçersiz mail");
        }else if (!girilenMetin.contains("@gmail")){
            System.out.println("mail gmail olmalı");
        }else if (!girilenMetin.endsWith("@gmail.com")){
            System.out.println("mail yazım hatası var");
        }else {
            System.out.println("mailiniz geçerli");
        }




















    }
























}
