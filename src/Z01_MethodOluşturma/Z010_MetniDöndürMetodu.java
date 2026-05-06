package Z01_MethodOluşturma;

public class Z010_MetniDöndürMetodu {

    public static void main(String[] args) {






    }

    public static String metnintersiniDondur(String metin){

        String tersMetin="";
        for (int i = metin.length()-1; i >=0 ; i--) {

            tersMetin+=metin.charAt(i);
        }

        return tersMetin;

    }















}
