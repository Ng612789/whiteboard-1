
public class p6 {
    public static void main(String[] args) {

        String text = "Hello, world!";

        int maxCount = 0;
        char maxChar = ' ';

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            int count = 0;
            
            // Ignore whitespaces and punctuation
            if (!Character.isLetterOrDigit(current))
                continue;

            // Calculate the frequency that current digit appears
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == current)
                    count++;
            }

            if (count > maxCount) {
                maxCount = count;
                maxChar = current;
            }
        }
        System.out.println("Character: '" + maxChar + "', Occurrence: " + maxCount);
    }
}