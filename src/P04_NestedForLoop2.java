import java.util.Scanner;

public class P04_NestedForLoop2 {
    public static void main(String[] args) {
        // kulanıcıdın satır ve sutun sayısını alıp aşağıdaki şekli yazdırın
        // foor loop kullanarak asagıdaki sayıları yazdırın
        //2 3 4 5 6
        //3 4 5 6 7
        //4 5 6 7 8
       //5 6 7 8 9
        //ilk yani outer loop satırı
        //ikinci yani inner loop sutunu temsil eder
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen satır sayısını giriniz ....");
     int satırSayısı=scanner.nextInt();
        System.out.println("Lütfen sütün sayısını giriniz ......");
        int sütunSayısı= scanner.nextInt();

        for (int i = 1; i <=satırSayısı ; i++) {
            for (int j = 1; j <=sütunSayısı ; j++) {

                System.out.println(i+j+" ");

            }
            System.out.println("");
        }


































    }

































}
