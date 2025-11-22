public class V04_equalsIgnoreCase {
    public static void main(String[] args) {
        String str1="ALİ";
        String str2="ALI";
        /*
          Stringleri karşılaştırmak için == kullandığımızda
   hem METNI hemde String in referansini kontrol eder.


   == ile karşılaştırdıgımızda METNI ayni olan Stringler icin
   bazen true bazen false sonuc verir.
   Bunu ilerde göreceğiz ama şimdilik STRING ler i karşılaştırmak icin
   bazen true bazen false sonuc verir

     equals verilen stringleri SADECE METIN olarak karşılaştırır

         */
        if (str1.equalsIgnoreCase(str2)){
            System.out.println("str1 str2 ye eşittir");
        }else System.out.println("eşit değildir");
        if (str1.equals(str2)){
            System.out.println("str1 str2 ye eşittir");
        }else System.out.println("eşit değildir");






























    }























}
