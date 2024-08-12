package JavaCode;

public class PrintElementAtEvenIndex {
    public static void main(String args[]) {
        System.out.println("print array of even index");
        int[] ar = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 2; i < ar.length; i++) {
            System.out.print(ar[i]);
            i = i + 1;
        }
    }
    }
