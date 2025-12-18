import java.util.Scanner;

public class E04_ForLookBitişVeBaşlangıçDeğeri {
    public static void main(String[] args) {
        //Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen bir pozitif sayı giriniz...");
        int başlangıçDeğeri=scanner.nextInt();
        System.out.println("lütfen pozitif bir bitiş sayısı giriniz ...");
     int bitişDeğeri=scanner.nextInt();
     int toplamDeğeri=scanner.nextInt();

     if (başlangıçDeğeri>bitişDeğeri){
         System.out.println("başlangıç değeri bitiş değerinden büyük olamaz");
     }else {
         for (int i =başlangıçDeğeri; i <=bitişDeğeri ; i++) {


         }
     }
























    }

























}
