import java.util.Scanner;

public class A08_SwitchStatements {
    public static void main(String[] args) {
        //Ornegin kullanicinin rakam olarak girdigi gun numarinin ismini yazmamiz icin 8 if
//else gerekir
        Scanner scanner=new Scanner(System.in);
        System.out.println("günün yazmak istediğiniz rakamı giriniz");
        int rakam=scanner.nextInt();
        if (rakam==1){
            System.out.println("pazartesi");
        }else if (rakam==2){
            System.out.println("salı");
        }else if (rakam==3){
            System.out.println("çarşamba");
        }else if (rakam==4){
            System.out.println("perşembe");
        }else if (rakam==5){
            System.out.println("cuma");
        }else if (rakam==6){
            System.out.println("cumartesi");
        }else if (rakam==7){
            System.out.println("pazar");
        }else System.out.println("girdiğiniz rakam için gün adı yoktur");
        //====================Swith Statment ile çözünüz ======//
        switch (rakam){
            case 1: System.out.println("pazartesi");
            break;

            case 2 : System.out.println("salı");
            break;
            case 3 : System.out.println("çarşamba");
           break;
            case 4 : System.out.println("perşembe");
          break;
            case 5: System.out.println("cuma");
            break;

            case 6: System.out.println("cumartesi");
             break;
            case 7 : System.out.println("pazar");
           break;
            default:
                System.out.println("verdiğiniz rakam karşılığında gün yoktur");


        }



































    }
































}
