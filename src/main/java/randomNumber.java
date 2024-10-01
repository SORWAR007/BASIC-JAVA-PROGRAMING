
    import java.util.Random;
    public class randomNumber {

        public static void main(String[] args) {
            int[] numbers = new int[10];
            Random random = new Random();


            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100);
            }
            System.out.println("Generated numbers:");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
            int max = numbers[0];
            int min = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }

            System.out.println("Maximum number: " + max);
            System.out.println("Minimum number: " + min);
        }
    }



