package B03_RaperVeMatematikselİşlemler;

import java.util.Scanner;

public class F02_ModulusSoru1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı bir sayı giriniz :");
        int verilenSayı=scanner.nextInt();

        int birlerBasamağı=verilenSayı%10;
        int sayınınÜçBasamaklıHali=verilenSayı/10;
        int onlarBasamağı=sayınınÜçBasamaklıHali/10;
        int sayınınİkiBasamaklıHali=sayınınÜçBasamaklıHali/10;
        int yüzlerBasamağı=sayınınİkiBasamaklıHali/10;
        int binlerBasamaklıHali=sayınınİkiBasamaklıHali/10;
        System.out.println(birlerBasamağı+onlarBasamağı+yüzlerBasamağı+binlerBasamaklıHali);
























    }
























}
