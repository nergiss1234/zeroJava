package P01_NestedForLoop;

import java.util.Scanner;

public class P05_Tekrar {
    public static void main(String[] args) {
        /*
    * 1.1
    * * 2.1 2.2
    * * *3.1 .3.2 3.3
    * * * * 4.1 4.2 4.3 4.4
        
        
         */
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print("* ");
                
            }

            System.out.println();

            
        }       
        
      /*
for loop kullanarak asagidaki sayiları yazıdırın...
1 2 3 4
2 4 6 8
3 6 9 12
4 8 12 16
 */
        for (int i = 1; i <5 ; i++) {

            for (int j = 1; j <5 ; j++) {
                System.out.print(i*j+" ");

            }
            System.out.println("");
        }
        //kulanıcıdan satir ve surun sayisini alıp asagıdaki sekli yazdırın...
// orn satır =4 ,sutun=5 oldugunda
//23456
//34567
//45678
//56789
        Scanner scanner=new Scanner(System.in);

        System.out.println("lütfen satır sayısını giriniz");
        int satırsayısı=scanner.nextInt();
        System.out.println("lütfen sütün sayısını giriniz.....");
        int sütünsayısı=scanner.nextInt();
        for (int i = 0; i <= satırsayısı; i++) {


            for (int j = 0; j <=sütünsayısı; j++) {
                System.out.print(i+j+" ");

            }
            System.out.println("");
        }

        /*
        kullanıcıdan satır sütun sayısını alınız ve aşağıdaki şekli çizdiriniz....
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *

        örn satırsayısı=4
        örn sütunsayısı=6


         */
       Scanner scanner1=new Scanner(System.in);
        System.out.println("lütfen şekil için satırsayısını giriniz....");
        int satırsayısı1=scanner1.nextInt();
        System.out.println("lütfen şekil için sütun sayısını giriniz.....");
       int sutünsayısı=scanner1.nextInt();

        for (int i = 1; i <=satırsayısı1 ; i++) {

            for (int j = 1; j <=sütünsayısı ; j++) {
                System.out.println("* ");

            }
            System.out.println("");
        }


        /*
        kullanıcıdan satır sayısını alıp aşağıdakı sekli çizdirin

        *
        * *
        * * *
        * * * *
        * * * * *

         */














































        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
