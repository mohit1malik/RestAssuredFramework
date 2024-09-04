package JavaCode;

public class PrintArrayInReverseOrder {
    public static void main(String args[]) {
        System.out.println("print array in reverse Order");
        int[] ar = {6, 2, 3, 4};
        System.out.println("Original array");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
        }

        System.out.println("");
        System.out.println("reverse Order");
        System.out.println("");
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.print(ar[i]);
        }
    }
    }
