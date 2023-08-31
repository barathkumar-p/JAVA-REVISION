import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inputString = scanner.nextLine();
        
        // Reversing the word
        String reversedString = reverseWord(inputString);
        
        // Displaying the reversed word
        System.out.println("Reverse String: " + reversedString);
    }
    
    public static String reverseWord(String word) {
        char[] charArray = word.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        
        return new String(charArray);
    }
}
