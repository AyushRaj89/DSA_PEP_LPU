import java.util.Scanner;

public class Calculator {

    static int add(int a, int b){
        return a + b;
    }

    static int sub(int a, int b){
        if(a > b){
            return a - b;
        } else {
            return b - a;
        }
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int div(int a, int b){
        return a/b;
    }

    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum of {a} and {b} is "+add(a, b));
        System.out.println("Subtraction of {a} and {b} is "+sub(a, b));
        System.out.println("Multiplication of {a} and {b} is "+mul(a, b));
        System.out.println("Division of {a} and {b} is "+div(a, b));
    }
}
