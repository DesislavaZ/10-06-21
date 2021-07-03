public class Zad2 {
    public static void main(String[] args) {
        int[][] magicSquare = {
                {16, 3, 2, 10},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}
        };
        int sumHoriz = 0;
        int sumVert = 0;
        int sumDiag1 = 0;
        int sumDiag2 = 0;
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare[0].length; j++) {
                sumHoriz += magicSquare[i][j];
                sumVert += magicSquare[j][i];
            }
            sumDiag1 += magicSquare[i][i];

        }

        if(sumHoriz ==sumVert && sumVert ==sumDiag1*4) {
        System.out.println("it's magic square!!!");
    } else
            System.out.println("Isn't magic square.");
}
}
