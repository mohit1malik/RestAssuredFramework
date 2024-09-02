package JavaCode;

public class VowelAndConsonantCount {
    public static void main(String[] args) {
        String str = "MohitMalik";
        str = str.toLowerCase();
        System.out.println(str);
        int vowel =0, consonant =0;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == 'a'|| str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                vowel++;
                System.out.println("Vowel found - " + str.charAt(i));
            }else{
                consonant++;
                System.out.println("Consonant found - " + str.charAt(i));
            }
        }
        System.out.println("Vowel Count - " + vowel);
        System.out.println("Consonant Count - " + consonant);
    }
}
