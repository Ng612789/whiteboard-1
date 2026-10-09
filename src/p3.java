import java.util.Scanner;

public class p3 {
    
    public static int FibonacciSequence(int n){

        if (n == 0)
            return 0;
        else if (n == 1) 
            return 1;
        else
            return FibonacciSequence(n - 1) + FibonacciSequence(n - 2);
    }

    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of Fibonacci element: ");
        int count = input.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print(FibonacciSequence(i));

            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        input.close();
    }
}
