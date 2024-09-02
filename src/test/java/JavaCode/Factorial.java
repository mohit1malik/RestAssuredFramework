package JavaCode;

public class Factorial {
    public static void main(String[] args) {
        int num = 12;
        boolean isPrime = true;
        double b = Math.sqrt(num);
        for (int i = 2; i <= b; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
