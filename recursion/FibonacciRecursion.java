
public class FibonacciRecursion {

    public static void main(String[] args) {
        // int n = 10; 
        // long fibonacciNumber = fibonacci(n);
        // System.out.println("The " + n + "th Fibonacci number is: " + fibonacciNumber);
        System.out.println(fibonacci(4));
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n; 
        }
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //this is the formula derived to find the answer using the recurrence formula.
    public static int fiboFormula(int n)
    {
        return (int)((Math.pow(((1+Math.sqrt(5)))/2,n))/Math.sqrt(5));
    }
    
}
