
public class p5 {
    public static void main(String[] args) {

        int[] list1 = {4, 5, 2, 3, 1, 6};
        int[] list2 = {8, 7, 6, 9, 4, 5};

        // Store in result to arrange their ordering
        int[] result = new int[12];
        int count = 0;

        // Check numbers in the first list
        for (int i = 0; i < list1.length; i++) {
            boolean found = false;

            for (int j = 0; j < list2.length; j++) {
                if (list1[i] == list2[j]) 
                    found = true;
            }

            if (found == false) {
                result[count] = list1[i];
                count++;
            }
        }

        // Check numbers in the second list
        for (int i = 0; i < list2.length; i++) {
            boolean found = false;

            for (int j = 0; j < list1.length; j++) {
                if (list2[i] == list1[j])
                    found = true;
            }

            if (found == false) {
                result[count] = list2[i];
                count++;
            }
        }

        // Sort the answer
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < count; i++) {
            if (i > 0)
                System.out.print(", ");

            System.out.print(result[i]);
        }
    }
}