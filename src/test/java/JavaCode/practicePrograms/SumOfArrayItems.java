package JavaCode.practicePrograms;

import java.util.Arrays;

public class SumOfArrayItems {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4};
        int sum = 0;
        for(int i=0; i<ar.length ;  i++){
            sum = sum+ar[i];
        }
        System.out.print(sum);


        Arrays.sort(ar);
    }
}
