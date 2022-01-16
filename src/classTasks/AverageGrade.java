package classTasks;

import java.util.Scanner;

public class AverageGrade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float sum = 0f;

        System.out.println("Please enter how many grades you have: ");
        int arraySize = scanner.nextInt();
        float storageArray[] = new float[arraySize];

        System.out.println("Please enter grades one by one:");

        for (int i = 0; i<arraySize; i++){
            System.out.println("Please enter grade number: " + (i+1));
            storageArray[i] = scanner.nextInt();
            sum += storageArray[i];
        }

        System.out.println("Average grade " + (sum/arraySize) );
        System.out.println("There was passed " + arraySize + " grade");

    }
}
