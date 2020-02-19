package Fibonacci_Series_Using_Recursion;

/**
 *
 * @author Dinesh Nanda
 */

public class Fibonacci_Series_Using_Recursion {
    
    static int num1 = 0, num2 = 1, num3;
    
    public void fibo(int number){
        if(number >= 1){
            
            num3 = num1 + num2;
            System.out.print(" "+num3);
            num1 = num2;
            num2 = num3;
            fibo(number-1);
        }
    } 
    
    public static void main(String[] args) {
        
        int count = 10;
        System.out.print(num1+" "+num2);
        Fibonacci_Series_Using_Recursion fib = new Fibonacci_Series_Using_Recursion();
        fib.fibo(count - 2);
        
    }
}
