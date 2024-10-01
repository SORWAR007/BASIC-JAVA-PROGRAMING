import java.util.Scanner;

public class removevowel {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            String result = removeVowels(input);
            System.out.println("String after removing vowels: " + result);
        }
        public static String removeVowels(String str) {
            StringBuilder sb = new StringBuilder();
            String vowels = "aeiouAEIOU";
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (vowels.indexOf(c) == -1) {
                    sb.append(c);
                }
            }
            return sb.toString();
        }
    }

