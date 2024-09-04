package JavaCode.practicePrograms;

import java.util.Scanner;

public class Claclulator {
    public static void main(String[] args) {
        double n1 , n2, res = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:- ");
        n1 = sc.nextInt();
        System.out.println("Enter Second Number:- ");
        n2 = sc.nextInt();
        System.out.println("Enter operation '+, -, *, /'");
        char op = sc.next().charAt(0);
        switch(op){
            case '+': res = n1 + n2;
                break;
            case '-': res = n1 - n2;
                break;
            case '*': res = n1 * n2;
                break;
            case '/': res = n1 / n2;
                break;
            default: throw new IllegalArgumentException("Invalid Operator");
        }
        System.out.println("Resutl is :- " + res);
    }
}
