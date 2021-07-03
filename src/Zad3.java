import java.util.Scanner;
import java.util.Arrays;
public class Zad3 {
    public static void main(String[] args) {
        int[][] matrix6 = {
                { 11,12,13,14,15,16},
                {21,22,23,24,25,26},
                {31,32,33,34,35,36},
                {41,42,43,44,45,46},
                {51,52,53,54,55,56},
                {61,62,63,64,65,66}
        };
        int sum = 0;

        for (int j = 0; j < matrix6[0].length; j+=2) {
            sum=0;

             for (int i = 0; i < matrix6.length; i++) {

                sum+=matrix6[i][j];
                 System.out.print(matrix6[i][j]+", ");

            }System.out.println("the sum of the elements is: " + sum);



        }
    }
}
