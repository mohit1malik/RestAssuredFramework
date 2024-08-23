package JavaCode;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,2,4};
        int[] fr = new int[ar.length];
        int set = -1;

        for(int i = 0; i <ar.length; i++){
            int count  = 1;
            for(int j= i+1; j<ar.length; j++){
                if(ar[i] == ar[j]){
                    count++;
                    fr[j] = set;
                }
            }
            if(fr[i] != set){
                fr[i] = count;
            }
        }

        for(int i = 0; i< fr.length; i++){
            if(fr[i] != set){
                System.out.println(ar[i] +" count is - " + fr[i]);
            }
        }
    }
}
