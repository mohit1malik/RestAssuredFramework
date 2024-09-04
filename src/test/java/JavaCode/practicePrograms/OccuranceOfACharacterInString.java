package JavaCode.practicePrograms;

public class OccuranceOfACharacterInString {
    public static void main(String[] args) {
        String str ="Automation";
        str= str.toLowerCase();
        System.out.println(str);
        char ch ='a';
        int count =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)== ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
