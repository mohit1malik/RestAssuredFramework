package JavaCode.practicePrograms;
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter You want to check -- ");
        int year = sc.nextInt();
        boolean isLeap = (year%4 ==0) && (year%100 != 0) || (year%400 ==0);
        System.out.println(isLeap);

        System.out.println("-----");

        System.out.println(isLeapYear(2300));

    }

    public static <T extends Number> boolean isLeapYear(T year) {
        // Convert the year to an integer
        int yearValue = year.intValue();

        // Check if the year is divisible by 4
        if (yearValue % 4 == 0) {
            // Check if the year is divisible by 100
            if (yearValue % 100 == 0) {
                // Check if the year is divisible by 400
                if (yearValue % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}