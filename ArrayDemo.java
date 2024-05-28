public class ArrayDemo {

    public static void main(String[] args) {
        int[] numbersArray = new int[5];

        numbersArray[0] = 17;
        numbersArray[1] = 34;
        numbersArray[2] = 54;
        numbersArray[3] = 77;
        numbersArray[4] = 47;

        // Uncommented and corrected the original for loop
        // for (int i = 0; i < numbersArray.length; i++) {
        //     System.out.println(numbersArray[i]);
        //     if (numbersArray[i] == 54) {
        //         System.out.println("Found " + numbersArray[i]);
        //         break;
        //     }
        // }

        for (int i = numbersArray.length - 1; i >= 0; i--) {
            System.out.println(numbersArray[i]);
            if (numbersArray[i] == 54) {
                System.out.println("Found " + numbersArray[i]);
                break;
            }
        }

        // isPalindrome 
        String testString1 = "A man, a plan, a canal, Panama";
        String testString2 = "Hello, world";
        String testString3 = "civic";

        System.out.println("\"" + testString1 + "\" is a palindrome: " + isPalindrome(testString1));
        System.out.println("\"" + testString2 + "\" is a palindrome: " + isPalindrome(testString2));
        System.out.println("\"" + testString3 + "\" is a palindrome: " + isPalindrome(testString3));
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        
        String cleanedStr = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int length = cleanedStr.length();

        // Check if the string is equal to its reverse
        for (int i = 0; i < length / 2; i++) {
            if (cleanedStr.charAt(i) != cleanedStr.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
