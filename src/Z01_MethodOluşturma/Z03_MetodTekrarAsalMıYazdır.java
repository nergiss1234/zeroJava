package Z01_MethodOluşturma;

public class Z03_MetodTekrarAsalMıYazdır {
    public static void main(String[] args) {

      //verilen sayının asal olup olmadığını yazdırın ...
    AsalMıYazdır(33);
    AsalMıYazdır(21);







    }
public static void AsalMıYazdır(int sayı){
    for (int i = 2; i <sayı ; i++) {
        if (sayı%i==0){
            System.out.println("verilen"+sayı+"sayısı asal değildir");
            break;
        }
        if (i==sayı-1){
            System.out.println("verilen"+sayı+"sayısı asal sayıdır");


        }


    }


}























}
