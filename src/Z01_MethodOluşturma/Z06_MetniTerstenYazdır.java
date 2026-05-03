package Z01_MethodOluşturma;

public class Z06_MetniTerstenYazdır {


    public static void main(String[] args) {
        //metni tersten yazdıran bir method oluşturun ....
        metniTerstenYazdırın("ey edip adanada pide ye");
        System.out.println(" ");
        metniTerstenYazdırın("Nergis");



    }
   public static void metniTerstenYazdırın(String metin){

       for (int i = metin.length()-1; i >=0 ; i++) {
           System.out.print(metin.charAt(i));

       }





   }








}
