public class K03_SubstringİkiParaMetre {
    public static void main(String[] args) {
        String str="giden gitmiştir gittiği gün bitmiştir";

     //ilk kelime hariç yazdırın...
        int indexİlkBoşluk=str.indexOf(" ");
        System.out.println(str.substring(indexİlkBoşluk));//gitmiştir gittiği gün bitmiştir
        //sadece 3. harfi string olarak başka bir varaible a kaydedin
        String üçüncüHarf=str.substring(2,3);
        System.out.println(üçüncüHarf);//d
        //7.indekstedki harfi büyük harf olarak yazdırın
        System.out.println(str.substring(7, 8).toUpperCase());//i
        //başlangıç ve bitiş indeksleri aynı olursa
        System.out.println(str.substring(2, 2));//''
        //başlangıç indeksi bitiş indeksinden büyük olursa
       // System.out.println(str.substring(3,2));//hata veriyo
        // baştan 10.karakteri yazdırırken 2 adet yöntemi de kullanalım
        System.out.println(str.charAt(9));//m
        System.out.println(str.substring(9, 10));//m
        //15.indeksten başlayıp 8 karakter yazdırın
        System.out.println(str.substring(15, 23));// gittiği
        // baştan 3. karakterden başlıycak
        //sondan 3.karaktere kadar (dahil) olan bölümü yazdırın
        System.out.println(str.substring(2, str.length() - 2));//den.........t




    }






































}
