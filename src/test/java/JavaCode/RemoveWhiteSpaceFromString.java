package JavaCode;

public class RemoveWhiteSpaceFromString {
    public static void main(String[] args){

        String str = "This is string";
        String newStr = str.replaceAll("\\s","");

        System.out.println(newStr);
        System.out.println("-------------");

        char[] ar = str.toCharArray();
        StringBuffer bfr = new StringBuffer();

        for(int i=0 ; i< ar.length; i++){
            if(ar[i]!=' '){
                bfr.append(ar[i]);
            }
        }
        String str1 = bfr.toString();
        System.out.println(str1);

    }

}
