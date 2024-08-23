package JavaCode;

public class MaximumNumberinArray {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,7,2,5,11,-1};
        int max = ar[0];
        for(int i=0; i<ar.length ;  i++){
            if(ar[i] > max){
                max = ar[i];
            }
        }
        System.out.print(max);

    }
}
