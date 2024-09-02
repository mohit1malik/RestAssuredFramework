package JavaCode;

public class ReverseStringUsingStringBufferMethod {

    public static void main(String[] args) {
        String str = "automation";
        StringBuffer st = new StringBuffer(str).reverse();
        System.out.println(st);
    }
}
