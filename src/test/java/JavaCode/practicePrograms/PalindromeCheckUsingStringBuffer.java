package JavaCode.practicePrograms;

public class PalindromeCheckUsingStringBuffer {
    public static void main(String[] args) {
            String str = "Oyo";
            StringBuffer st = new StringBuffer(str).reverse();
            System.out.println(str.equals(st));


    }
}
