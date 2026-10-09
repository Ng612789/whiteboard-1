
public class p7 {

    public static int SquareRoot(int x) {
        // compare and find the squareroot that match the value
        for (int i = 0; i <= x; i++) {
            if (i * i == x)
                return i;
        }
        // if not found
        return -1;
    }

    public static void main(String[] args) {
        int x = 10;

        System.out.println("Square root: " + SquareRoot(x));
    }
}