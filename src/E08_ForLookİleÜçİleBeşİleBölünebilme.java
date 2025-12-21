import java.util.Scanner;

public class E08_ForLookİleÜçİleBeşİleBölünebilme {


    public static void main(String[] args) {
        //Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum
//tamsayilari yazdirin, sira
//- 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
//- 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
//- hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz
//yazdirin
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen pozitif bir tam sayı giriniz ...");
        int girilenSayı=scanner.nextInt();
        for (int i = 1; i <=girilenSayı ; i++) {

            if (i%3==0&&i%5==0){
                System.out.print("fizzbuzz");
            }
            if (i%3==0){
                System.out.print("fizz");
            }
            if(i%5==0) {
                System.out.print("buzz");


            }
            System.out.print(i+" ");

        }
























    }
























}
