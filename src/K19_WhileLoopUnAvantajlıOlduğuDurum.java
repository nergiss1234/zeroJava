import java.util.Scanner;

public class K19_WhileLoopUnAvantajlıOlduğuDurum {
    public static void main(String[] args) {

        //kullanıcıya istediği kadar sayı girmasini söyleyin
        //girilen sayılar pozitif ise sayıyı toplama ekleyin
        //girilen sayı negatif ise uyarı verin ve sayıyı işleme almayın
        //girilen sayı sıfır olduğunda işlemi bitirin
        // ve kaç tane pozitif tam sayı girildiğini ve toplamlarını yazdırın
        Scanner scanner=new Scanner(System.in);
        int sayı1=10;
        //sıfırdan farklı bir sayı veriyoruz çünkü
        // 0 bir condition yani şart
        int  toplam=0;
        int sayaç =0;
        while (sayı1!=0){
            System.out.println("lütfen pozitif bir sayı girin");
            sayı1=scanner.nextInt();
            if (sayı1>0){
                toplam+=sayı1;
                sayaç++;
            } else if (sayı1<0) {
                System.out.println("girilen sayı negatif sayı olamaz");

            }
        }
        System.out.println("girilen"+sayaç+"adet pozitif tam sayının toplamı "+toplam);

















    }



















}
