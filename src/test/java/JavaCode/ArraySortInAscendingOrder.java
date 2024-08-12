package JavaCode;

public class ArraySortInAscendingOrder{
    public static void main(String args[]){
System.out.println("Sort Array in Ascending Order");
    int[] ar = {5,8,3,4,5,6,2,7,5};
for(int i= 0; i<ar.length;i++){
        int temp=0;
        for(int j= i+1; j<ar.length; j++){
            if(ar[i]>ar[j]){
                temp = ar[i];
                ar[i]= ar[j];
                ar[j] = temp;
            }
        }
    }
for(int i=0; i<ar.length; i++){
        System.out.print(ar[i]);
    }

}
}
