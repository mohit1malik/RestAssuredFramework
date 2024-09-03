package JavaCode.practicePrograms;

public class PrimeNumber {
    public static void main(String[] args) {
        Boolean isPrime = true;
        int num = 117;
        for(int i=2; i<Math.sqrt(num); i++){
            if(num %2 == 0){
                isPrime = false;
                break;
            }
        }
        System.out.print(isPrime);
    }
}
