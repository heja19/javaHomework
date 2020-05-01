//Exercise 3

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Insert temperature:"); //asking from user to insert the temperature
        int temperature = input.nextInt( );

        //result
        if (temperature > 25) {
            System.out.println("Hot!");
        }
        else if (temperature < 10) {
            System.out.println("Cold!");
        }
        else {
            System.out.println("Warm!");
        }
    }
}
