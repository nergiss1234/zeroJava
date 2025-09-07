package N01_NergisÇalışma;

import java.util.Scanner;

public class M01_Çalışma {
    public static void main(String[] args) {
        //Kullanıcıdan bir karenin 2 kenar uzunluğunu alıp , karenin alanını yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen Bir Kenar Uzunluğu Giriniz :");
        int birKenarUzunluğu=scanner.nextInt();

        System.out.println("Lütfen Diğer Kenar Uzunluğunu Giriniz:");
        int diğerKenarUzunluğu =scanner.nextInt();

        int kareninAlanı =birKenarUzunluğu*diğerKenarUzunluğu ;

        System.out.println("Karenin Alanı"+ kareninAlanı+"cm karedir");
























    }



























}
