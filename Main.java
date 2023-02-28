package first_package;
import java.util.Arrays;

/**
 * Creeaza si afiseaza patratul latin de dimensiuni n x n. <p></p>
 * Contine 2 metode
 * */

public class Main {

    /**
     * Creeaza patratul latin intr o matrice de dimensiuni n x n.<p> </p>
     * Pentru n<30.000 metoda printeaza matricea cu n linii si n coloane, iar
     * pentru n>=30.000 metoda printeaza doar timpul de rulare masurat in nanosecunde.
     * @param n citit de la linia de comanda
     */
    static void latinSquare(int n) {
        long startTime = System.nanoTime();
        int[][] mat = new int[n][n];

        int i;
        for (i = 0; i < n; i++) {
            int p = 1;
            int j;
            for (j = i; j < n; j++) {
                mat[i][j] = p;
                p++;
            }
            int q = n;
            int k;
            for (k = i-1; k >= 0; k--) {
                mat[i][k] = q;
                q--;
            }
        }

        if (n < 30000) {

            System.out.println(Arrays.deepToString(mat).replaceAll("],", System.lineSeparator()).replaceAll(",", "").replaceAll("\\["," ").replaceAll("]",""));


        } else {
            long elapsedTime = System.nanoTime() - startTime;
            System.out.println("Total execution time in nanoseconds : " + elapsedTime );

        }
    }

    /**
     * Citeste n de la linia de comanda.
     * Aplica metoda latinSquare() de mai sus pentru n
     * @param args (argumentele)
     */
    public static void main(String[] args) {

        if(args.length!=0) {
            int n = Integer.parseInt(args[0]);
            System.out.println("n=" + n);
            latinSquare(n);
        }



        }

    }



