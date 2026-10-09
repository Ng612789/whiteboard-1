public class p2{

    public static void main(){
        for (int i = 1; i < 101; i++){
            
            // Divisible by both 3 and 5
            if(i % 3 == 0 && i % 5 == 0)
                System.out.print("FizzBuzz");
            // Divisible by 3 
            else if(i % 3 == 0)
                System.out.print("Fizz");
            // Divisible by 5
            else if(i % 5 == 0)
                System.out.print("Buzz");
            else
                System.out.print(i);
            
            // Make the output clearly
            if (i < 100)
                System.out.print(", ");
        }
    }
}