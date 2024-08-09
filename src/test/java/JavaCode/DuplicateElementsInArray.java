package JavaCode;

public class DuplicateElementsInArray {
    public static void main(String args[]){
        int[] ar = {6,2,3,4,5};
        for(int i= 0; i<ar.length; i++){
            for (int j =i+1;j<ar.length; j++){
                if(ar[i]==ar[j]){
                    System.out.println(ar[j]);
                }
            }
        }
    }
}
