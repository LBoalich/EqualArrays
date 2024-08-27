/**
 * Name: Equal Arrays
 * Author: Leah Boalich
 * Date: August 25, 2024
 * Assignment: Module 1 Exercise 8.29
 * Description:  This program asks the user to enter integers to fill two two-dimensional arrays.  It then displays if the two arrays are equal or not.
 */

 import java.util.Scanner;

 public class TestEquals {
    /** Main method */
    public static void main(String[] args) {
        // Prompt the user to enter first array
        int[][] array1 = createArray();
        // Promt the user to enter second array
        int[][] array2 = createArray();
        // Display if the arrays are the same
        System.out.println(equals(array1, array2) ? "The two arrays are identical" : "The two arrays are not identical");
    }
    
    /** Prompt the user for integers and returns array */
    public static int[][] createArray() {
        // Create a Scanner object 
        Scanner input = new Scanner(System.in);
        // Prompt user for integers to fill array
        System.out.println("Enter 9 integers to fill a 3 x 3 array:");
        // Initialize array
        int[][] array = new int[3][3];
        // Fill array with user input
        for (int i = 0; i < 3; i++) //row
            for (int j = 0; j < 3; j++) //column
                array[i][j] = input.nextInt();
        return array;
    }

    //Check if two two-dimensional arrays are equal
    public static boolean equals(int[][] m1, int[][] m2) {
        // Loop through rows
        for (int i = 0; i < m1.length; i++) {
            // Loop through columns
            for (int j = 0; j < m1[i].length; j++) {
                // Check for equality
                if (m1[i][j] != m2[i][j]) {
                    return false;
                } 
            }
        }
        return true;
    }
}
