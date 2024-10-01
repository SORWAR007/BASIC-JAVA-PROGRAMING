public class orderofhighestCGPA {

    public static void main(String[] args) {
        double[] cgpArray = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};


        sortDescending(cgpArray);
        System.out.println("Sorted CGPAs in descending order:");
        for (double cgpa : cgpArray) {
            System.out.print(cgpa + " ");
        }
    }
    public static void sortDescending(double[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] < array[j]) {
                    double temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}


