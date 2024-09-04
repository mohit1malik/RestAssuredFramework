package JavaCode;

public class FrequencyOfEachElelement {
    public static void main(String args[]){
        int[] ar = {3,4,2,4,5,2,1,2};
        int[] fr = new int[ar.length];
        int visited = -1;

        for(int i= 0; i<ar.length;i++){
            int count = 1;
            for(int j = i+1; j<ar.length;j++){

                if(ar[i] == ar[j]){
                    count++;
                    fr[j]= visited;
                }
            }
            if(fr[i]!=visited){
                fr[i]=count;
            }
        }

        for(int i=0;i<fr.length;i++){
            if(fr[i]!=visited){
                System.out.println(ar[i] +"  ||  "+fr[i]);
            }
        }
    }
}
