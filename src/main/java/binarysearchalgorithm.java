import java.util.Arrays;
import java.util.Scanner;

public class binarysearchalgorithm {

    public static void main(String[] args) {
        double[] cgpArray = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        Arrays.sort(cgpArray);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your CGPA: ");
        double userCGPA = scanner.nextDouble();
        int result = binarySearch(cgpArray, userCGPA);
        if (result == -1) {
            System.out.println("CGPA " + userCGPA + " is not present in the array.");
        } else {
            System.out.println("CGPA: "+userCGPA + " is present in the array");
        }

    }
    public static int binarySearch(double[] array, double key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == key) {
                return mid; // Key found
            }
            if (array[mid] < key) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
}