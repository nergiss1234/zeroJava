import java.util.Scanner;

public class G05_HarfDeğiştirme {
    public static void main(String[] args) {

        //Kullanıcıdan bir harf isteyin
// harf kucuk ise BUYUK
//harf buyuk ise KUCUK yazdırın
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen harf giriniz");
        char girilenHarf =scanner.next().charAt(0);
        //aski Table göre char data türündeki karakterlerin matematiksel
        //karşılıkları vardır örneğin küçük a 97 küçük98 küçük c 99 bu şekilde artarak devam eder
        //büyük A ise 65 B ise 66 Büyük C67 bu şekilde devam eder.
        if (girilenHarf>='A'&&girilenHarf<='Z'){
            System.out.println((char) (girilenHarf+32));
        }else System.out.println((char)(girilenHarf-32));

        if (Character.isUpperCase(girilenHarf)){


            System.out.println(Character.toLowerCase(girilenHarf));
        }else System.out.println(Character.toUpperCase(girilenHarf));





















    }





















}
