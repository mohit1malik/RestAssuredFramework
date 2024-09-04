package JavaCode.practicePrograms;

import java.util.Arrays;

public class ArrayContinuousLength {
    public static void main(String[] args){

        int ar[] = {4,2,6,8,5,7,9,14,12,13,15,22,23,24,25,26,27,28,29,30};
        // int ar[] = {2,4,5,6,7,8,9,12,13,14,15};
        Arrays.sort(ar);
        int n = ar[0];
        int counter =1;
        int maxlength = 1;
        for(int i=1; i<ar.length; i++){
            if(ar[i] == n+1){
                counter++;
                n = ar[i];
                if(maxlength < counter){
                    maxlength = counter;

                }
            }else{
                counter = 1;
                n= ar[i];
            }
        }

        System.out.print(maxlength);



    }


}
