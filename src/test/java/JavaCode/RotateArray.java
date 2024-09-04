package JavaCode;

public class RotateArray {
    public static void main(String args[]) {
        int[] ar = {6, 2, 3, 4, 5};
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
        }
        int n = 1;
        for (int i = 0; i < n; i++) {
            int j, first;
            first = ar[0];
            for (j = 0; j < ar.length - 1; j++) {
                ar[j] = ar[j + 1];
            }
            ar[j] = first;
        }
        System.out.println("");
        for (int i = 0; i <= ar.length; i++) {
            System.out.print(ar[i]);
        }
    }

    }
