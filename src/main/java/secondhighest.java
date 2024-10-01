public class secondhighest {

    public static void main(String[] args) {

        double[] cgpArray = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double secondHighest = findSecondHighest(cgpArray);
        if (secondHighest != -1) {
            System.out.println("The second highest CGPA is: " + secondHighest);
        } else {
            System.out.println("There is no second highest CGPA.");
        }
    }
    public static double findSecondHighest(double[] array) {
        double highest = 0;
        double secondHighest=0;
        for (double cgpa : array) {
            if (cgpa > highest) {
                secondHighest = highest;
                highest = cgpa;
            } else if (cgpa > secondHighest && cgpa < highest) {
                secondHighest = cgpa;
            }
        }
        return secondHighest;

    }

}

