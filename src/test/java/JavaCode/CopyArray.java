package JavaCode;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] ar1 = {1,2,3};
        int[] ar2 = {4,5};
        int[] res = new int[ar1.length+ar2.length];
        System.arraycopy(ar1,0,res,0,ar1.length);
        System.arraycopy(ar2,0,res,ar1.length, ar2.length);
        System.out.println(Arrays.toString(res));
    }
}
