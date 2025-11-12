import java.util.Scanner;

public class A04_KiloMetreHesabıİf {
    public static void main(String[] args) {
        /*

         Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
“istediginiz birim sisteme kayitli degil” yazdirin.



         */
 Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen aldığınız mesafeyi km olarak giriniz");
        int girilenKM=scanner.nextInt();
        scanner.nextLine();//bu satırı buffer hatası almamak için koyduk
        //buffer hatası şundan kaynaklanır ...sayısal veri almayı sağlayan data türler;
        //byte,short,integer,long ve virgülü olan float ve double bunlar kendilerinden
        //sonra \n bırakırlar bu alt satıra geç demektir bu nedenle kendilerinden sonra METİNSEL
        //data türüne geldiğinde bu satırı otomatikman atlatırlar yokmuş gibi davranırlar bunada
        //buffer hatası denir...

        System.out.println("lütfen çevirmek istediğiniz birimi yazınız metre için M santimetre için CM yazın");
        String istenenBirim=scanner.nextLine().toUpperCase();

        if (!(istenenBirim.equals("M"))&&(!(istenenBirim.equals("CM")))){
            System.out.println("embesil doğru bilgi ver");
        }else if (istenenBirim.equals("M")){
            System.out.println("girdiğiniz mesafenin metre olarak karşılığı" + girilenKM*1000);

        }else System.out.println("girdiğiniz mesafenin metre olarak karşılığı" + girilenKM*1000000) ;

































    }

























}
