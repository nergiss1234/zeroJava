package V01_StringManipulations;

import java.util.Locale;

public class V02_Char {


    public static void main(String[] args) {
        String cümle="bağ bağcınındır";
        cümle =cümle.toUpperCase();//"BAĞ BAĞCININDIR"

        System.out.println(cümle.toLowerCase(Locale.forLanguageTag("Tr")));//bağ bağcınındır
        //stringin ilk harfini yazdırın
        String isim="Ramazan";
        System.out.println(isim.charAt(0));//R
        //isimdeki beşinci harfi yazdırın
        System.out.println(isim.charAt(4));//Z
        //son harfi yazdırın
        System.out.println(isim.length());//7
        System.out.println(isim.charAt(isim.length()-1));//n
        // sondan 3. harfi yazdırın
        //isim=Ramazan
        //son karaktesi lenght-1
        //son lenght-3
        System.out.println(isim.charAt(isim.length()- 3));//z
        //sondan 5.harfi yazdırın
        System.out.println(isim.charAt(isim.length()-5));//m

























    }

























}
