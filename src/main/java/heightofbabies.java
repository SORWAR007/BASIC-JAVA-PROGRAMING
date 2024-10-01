
import java.util.Scanner;

public class heightofbabies
{

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] heights = new int[10];

            System.out.println("Enter the heights of 10 babies in cm:");
            for (int i = 0; i < heights.length; i++) {
                System.out.print("Height of baby " + (i + 1) + ": ");
                heights[i] = scanner.nextInt();
            }

            int lowest, secondLowest;
            if (heights[0] < heights[1]) {
                lowest = heights[0];
                secondLowest = heights[1];
            } else {
                lowest = heights[1];
                secondLowest = heights[0];
            }

            for (int i = 2; i < heights.length; i++) {
                if (heights[i] < lowest) {
                    secondLowest = lowest;
                    lowest = heights[i];
                } else if (heights[i] < secondLowest && heights[i] != lowest) {
                    secondLowest = heights[i];
                }
            }

            System.out.println("Lowest height: " + lowest + " cm");
            System.out.println("Second lowest height: " + secondLowest + " cm");


        }
    }


