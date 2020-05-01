//Exercise2

import java.util.Scanner;

public class Exercise2 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the salary array:");
        int length = s.nextInt();
        double[] salary = new double[length];
        System.out.println("Enter the salaries of the salary array:");

        for(int i=0; i<length; i++ ) {
            salary[i] = s.nextInt();
        }

        for(int i=0; i<length; i++ ) {
            if (salary[i] >= 1000) { //no wage increase
                System.out.println("No wage increase for you.");
                System.out.println("Your salary is still " + salary[i] + "€");

            } else if (salary[i] < 1000) { //wage increase for this salary
                System.out.println("Your wage increase is 5%, before you had " +salary[i]  + "€");
                salary[i]  = salary[i] * 1.05;
                System.out.println("Your new salary is " + salary[i]  + "€");
            }
        }
    }
}

