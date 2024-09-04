package JavaCode.practicePrograms;

public class PrintDuplicateElements {
    public static void main(String args[]){
        int[] arr = {1,3,5,3,7,9,1,2,2};
        int[] fr = new int[arr.length];
        int visited = -1;
        for(int i = 0;i< arr.length; i++){
            for (int j = i+1; j< arr.length;j++){
                if(arr[i] == arr[j]){
                    fr[j] = visited;
                    fr[i] = arr[i];
                }
            }
        }
        for(int i=0;i<fr.length; i++){
            if(fr[i]!= visited && fr[i]!= 0 ) {
                System.out.println(fr[i]);
            }
        }
    }
}
