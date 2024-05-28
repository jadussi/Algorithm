import java.util.*;
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] checkers = new int[N][2];

        for (int i = 0; i < N; i++) {
            checkers[i][0] = scanner.nextInt();
            checkers[i][1] = scanner.nextInt();
        }

        int[] result = minMovesToGatherCheckers(N, checkers);

        for (int moves : result) {
            System.out.print(moves + " ");
        }
    }

    public static int[] minMovesToGatherCheckers(int N, int[][] checkers) {
        int[] results = new int[N];

        for (int k = 1; k <= N; k++) {
            int minMoves = Integer.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int cx = checkers[i][0];
                    int cy = checkers[j][1];
                    int[] distances = new int[N];

                    for (int l = 0; l < N; l++) {
                        distances[l] = Math.abs(cx - checkers[l][0]) + Math.abs(cy - checkers[l][1]);
                    }

                    Arrays.sort(distances);

                    int sum = 0;
                    for (int l = 0; l < k; l++) {
                        sum += distances[l];
                    }

                    minMoves = Math.min(minMoves, sum);
                }
            }

            results[k - 1] = minMoves;
        }

        return results;
    }

}
