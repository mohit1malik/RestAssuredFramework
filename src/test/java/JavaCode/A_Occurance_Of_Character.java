package JavaCode;

public class A_Occurance_Of_Character {
    public static void main(String args[]){
        String str= "this is test question";
        checkOccurance(str,'t');

    }

    public static void checkOccurance(String str, char value){
        int count =0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)==value){
                count++;
            }
        }
        System.out.println("Occurance Count is = " + count);
    }
}
