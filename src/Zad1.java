public class Zad1 {
    public static void main(String[] args) {
        int[][] ratingMovie = {
                {4, 6, 2, 5},
                {7, 9, 4, 8},
                {6, 9, 3, 7}
        };
        int averageRaiting = 0;
        int sumMovie3 = 0;
        for (int j = 0; j < ratingMovie[0].length - 1; j++) {
            sumMovie3 += ratingMovie[j][2];
            averageRaiting = sumMovie3 / ratingMovie.length;

        }
        System.out.println("Average rating for movie 3 is  " + averageRaiting);


    }

}
