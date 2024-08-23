package JavaCode;

public class ReverseOrderOfArray {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,2,5};
        for(int i=ar.length-1; i>=0 ;  i--){
            System.out.print(ar[i] + " ");
        }

    }
}
