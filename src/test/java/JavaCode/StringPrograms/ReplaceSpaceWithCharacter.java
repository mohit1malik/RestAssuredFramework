package JavaCode.StringPrograms;

public class ReplaceSpaceWithCharacter {
    public static void main(String args[]){
        String str = "This is String";
        char ch = '-';
        String res = str.replace(' ',ch);
        System.out.println(res);

    }
}
