package JavaCode.practicePrograms;

public class StringIsImmutable {
    public static void main(String[] args) {
        String str = "String";
        String str1 = "String";

        checkReference(str, str1);

        System.out.println("after modification");
        str += "ava";

        checkReference(str, str1);

        System.out.println(str);
        System.out.println(str1);

    }

    public static void checkReference(Object x, Object y){
        if(x==y){
            System.out.println("Both pointing to the same reference");
        }else{
            System.out.println("Both pointing to the different reference");
        }
    }

}
