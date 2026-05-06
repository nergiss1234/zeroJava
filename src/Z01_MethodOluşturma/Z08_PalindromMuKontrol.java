package Z01_MethodOluşturma;

public class Z08_PalindromMuKontrol {
    public static void main(String[] args) {
        // verilen metnin palindrom olup olmadığını kontrol edin
        //palindrom ise true değil ise false döndüren bir metod oluşturun

        System.out.println(palindromMuBakVeDondur("kazak"));
        System.out.println(palindromMuBakVeDondur("kalem"));
        System.out.println(palindromMuBakVeDondur(" ey edip adanada pide ye "));
        System.out.println(palindromMuBakVeDondur("123454321"));
        System.out.println(palindromMuBakVeDondur(" "));
        System.out.println(palindromMuBakVeDondur("11111111111"));
    }
    public static boolean palindromMuBakVeDondur(String metin){

        String tersMetin=Z010_MetniDöndürMetodu.metnintersiniDondur(metin);

        if (metin.equalsIgnoreCase(tersMetin)){
            return true;
        }else {

            return false;
        }







    }






















}
