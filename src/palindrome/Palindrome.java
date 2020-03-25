package palindrome;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeArray.reverse;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Enter to word:");
        String word1 = scanner.nextLine();
        stringBuilder.append(word1);
        stringBuilder = stringBuilder.reverse();

        System.out.println("Reverse enter word is: " + stringBuilder);

        if(word1.equals(stringBuilder)){
            System.out.println("This is palindrome");
        } else {
            System.out.println("This isn't palindrome");
        }
    }
}
