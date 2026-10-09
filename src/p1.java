public class p1 {

    public static void Sorting(int[] arr, int n) {
        int current;

        for (int i = 0; i < n - 1; i++) { // Calculate the compare frequency
            for (int j = 0; j < n - 1 - i; j++) { // Compare the digit
                if (arr[j] > arr[j + 1]) {
                    current = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = current;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] Array1 = {21, 400, 8, -3, 77, 99, -16, 55, 111, -36, 28};
        int ElementNumber = Array1.length;

        Sorting(Array1, ElementNumber);

        for (int i = 0; i < ElementNumber; i++) {
            System.out.print(Array1[i] + " ");
        }
    }
}