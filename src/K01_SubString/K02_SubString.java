package K01_SubString;

public class K02_SubString {


    public static void main(String[] args) {
        String str="az ye az uyu az konuş";
        //str nin karakter sayısını bulunuz.....

        System.out.println(str.length());//21







        //12. karakteri yazdırın.....

        System.out.println(str.charAt(11));//u
        System.out.println(str.substring(11,12));//u
        System.out.println(str.substring(1));//z ye az uyu az konuş


        //10.karakterden başlayıp ,sona kadar bütün metni yazdırın.....
      //uyu az konuş
        System.out.println(str.substring(9));
        //ilk kelime hariç geriye kalan metni yazdırın....
        System.out.println(str.substring(2));
        System.out.println(str.indexOf(" "));//2
        System.out.println(str.substring(str.indexOf(" ")));//ye az uyu az konuş
        //ilk harf hariç ,kalan metni yazdırın....
        System.out.println(str.substring(1));//z ye az uyu az konuş
        //sondan 5.karakteri yazdırın....
        System.out.println(str.substring(str.length() - 5));//k
        //son 5 karakterini yazdırın
        System.out.println(str.substring(str.length() - 5));//konuş
        //chatAt() ve substring() methodları farklı sonuçlar verebilir
        //lenght 30,son harfin indeksi 1 29


        //son karakteri charAt ile yazdırın
        System.out.println(str.charAt(str.length()-1));//ş
        //son karakteri substring ile yazdırın
        System.out.println(str.substring(str.length() - 1));//ş
        // index olarak str.lenght () i, kullanarak
// charAt() ve substring 'i kullanalım















    }

























}
