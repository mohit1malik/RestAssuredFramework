package JavaCode.StringPrograms;

public class ReverseAString {

    public static void main(String args[]){
        revString("testt");
        System.out.println("");
        System.out.println("///////");

        String str = "Hello";
        String revString= "";

        for(int i= str.length()-1; i>=0; i--){
            revString = revString+str.charAt(i);
        }
        System.out.println(revString);
    }

    public static void revString(String str){
        char[] ar = str.toCharArray();
        System.out.println(ar.length);
        for(int i = ar.length-1; i>=0; i--){
            System.out.print(ar[i]);
        }


    }

}
