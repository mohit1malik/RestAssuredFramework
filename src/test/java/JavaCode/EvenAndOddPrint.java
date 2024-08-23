package JavaCode;

public class EvenAndOddPrint {
    public static void main(String[] args) {
        int[] ar = {3,0, 5,3,1,7,2,3,4};
        int[] odd =new int[ar.length];
        int[] even =new int[ar.length];

        for(int i =0; i<ar.length; i++){

            if(ar[i]%2 != 0){
                System.out.println(ar[i] +" number is odd");
            }
            else{
                System.out.println(ar[i] +" number is even");
            }
        }

    }
}
