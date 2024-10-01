import java.util.ArrayList;

public class Notduplicate {

    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7};

        System.out.println("Numbers not duplicated:");
        printUniqueNumbers(numbers);
    }

    public static void printUniqueNumbers(int[] numbers) {
        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueList.add(numbers[i]);
            }
        }
        for (int num : uniqueList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}