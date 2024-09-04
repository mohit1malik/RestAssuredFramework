package JavaCode.practicePrograms;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] ar = {3,5,3,1,7,2,3,4};
        int[] fr =new int[ar.length];
        int temp =0;

        for(int i =0; i<ar.length; i++){
            for(int j = i+1; j<ar.length; j++){
                if(ar[i]>ar[j]){
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
            fr[i] = ar[i];
        }


        for(int i = 0; i<ar.length; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println("---");

        System.out.print("second largetst Number - " + fr[fr.length-2]);
    }
}
