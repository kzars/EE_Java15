package classTasks;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Please enter number 1");
        num1 = scanner.nextInt();
        System.out.println("Please enter number 2");
        num2 = scanner.nextInt();
        System.out.println("Please enter number 3");
        num3 = scanner.nextInt();

        //Solution 1
/*        if (num1 > num2) {
            if (num1 > num3){
                System.out.println("Max number: " + num1);
            } else {
                System.out.println("Max number: " + num3);
            }
        } else {
            if (num2 > num3){
                System.out.println("Max number: " + num2);
            } else {
                System.out.println("Max number: " + num3);
            }
        }*/


        //Solution 2

/*        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        }else if (num3 > num1 && num3 > num2) {
            System.out.println(num3);
        }*/

        // Solution 2 upgrade

/*        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num3) {
            System.out.println(num2);
        }else {
            System.out.println(num3);
        }*/

    //Solution 3 Math class
        int max = Math.max(num1,num2);
        System.out.println(Math.max(max,num3));

    // Solution 3 upgraded

        System.out.println(Math.max(Math.max(num1,num2),num3));


    }
}
