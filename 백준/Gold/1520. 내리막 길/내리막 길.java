import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static int[][] dp;
    static int m;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] mn = br.readLine().split(" ");
        m = Integer.parseInt(mn[0]);
        n = Integer.parseInt(mn[1]);

        map = new int[m][n];
        dp = new int[m][n];
        for(int i = 0; i < m; i ++) {
            String[] tmp = br.readLine().split(" ");
            for(int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(tmp[j]);
            }
        }
        for(int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        //bfs(0,0);
        //System.out.println(dp[m-1][n-1]);
        System.out.println(bfs(0, 0));
    }

    static int[] y = new int[]{-1,1,0,0};
    static int[] x = new int[]{0,0,-1,1};

    static int bfs(int a, int b) {
        if(a == m-1 && b == n-1) {
            return 1;
        }

        if(dp[a][b] != -1) {
            return dp[a][b];
        }

        dp[a][b] = 0;
        for(int i = 0; i < 4; i++) {
            int goY = a+y[i];
            int goX = b+x[i];

            if(goX >= 0 && goY >= 0 &&
               goY < m && goX < n ) {
                // 내가 갈 위치가 현재 위치보다 작아야 이동가능
                if(map[a][b] >  map[goY][goX] ) {
                    dp[a][b] += bfs(goY,goX);
                }
            }
        }
        return dp[a][b];
    }

}
