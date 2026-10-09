public class p4 {
    public static void main(String[] args) {

        int[] list1 = {4, 5, 2, 3, 1, 6};
        int[] list2 = {8, 7, 6, 9, 4, 5};
        boolean firstdigit = true;

        for(int i = 0; i < list1.length; i++){
            for(int j = 0; j < list2.length; j++){
                // Compare the number is same or not
                if(list1[i] == list2[j]){
                    if (!firstdigit) 
                        System.out.print(", ");
                    
                    System.out.print(list1[i]);
                    firstdigit = false;
                }
            }
        }
    }
}
