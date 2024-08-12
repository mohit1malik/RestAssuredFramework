package JavaCode;

public class DuplicatesInAString {
    public static void main(String args[]){

        String sr = "Total String to";
        char[] charStr= sr.toCharArray();
        for (int i=0 ;i<charStr.length; i++){
            for(int j =i+1; j<charStr.length; j++){
                if(charStr[i]==charStr[j]){
                    System.out.println(charStr[j]);
                    break;
                }
            }
        }
    }
}
