
public class p8 {

    public static boolean IsAnagram(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int count1 = 0;
        int count2 = 0;

        // removing whitespace and ignore case sensitivity
        for (int i = 0; i < str1.length(); i++) {
            char current = str1.charAt(i);
            if (!Character.isLetterOrDigit(current))
                continue;

            count1++;
        }

        for (int i = 0; i < str2.length(); i++) {
            char current = str2.charAt(i);
            if (!Character.isLetterOrDigit(current))
                continue;

            count2++;
        }

        if (count1 != count2)
            return false;

        // Store them into the array
        char[] arr1 = new char[count1];
        char[] arr2 = new char[count2];

        int index = 0;
        for (int i = 0; i < str1.length(); i++) {
            char current = str1.charAt(i);

            if (!Character.isLetterOrDigit(current))
                continue;

            arr1[index] = current;
            index++;
        }

        index = 0;
        for (int i = 0; i < str2.length(); i++) {
            char current = str2.charAt(i);

            if (!Character.isLetterOrDigit(current))
                continue;

            arr2[index] = current;
            index++;
        }

        // Sort first array
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    char temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }

        // Sort second array
        for (int i = 0; i < arr2.length - 1; i++) {
            for (int j = 0; j < arr2.length - 1 - i; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    char temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                }
            }
        }

        // Compare both arrays is same or not same
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(IsAnagram("listen", "silent"));
        System.out.println(IsAnagram("debit card", "Bad credit"));
        System.out.println(IsAnagram("hello", "bye"));
        System.out.println(IsAnagram("restful", "fluster")); // This answer may not same (I think the counts of each character are same)
        System.out.println(IsAnagram("listen", "silentt"));
        System.out.println(IsAnagram("Conversation", "Voices, rant on"));
    }
}