import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[101][101];

        for(int i = 0; i < num; i++) {
            String[] st = br.readLine().split(" ");
            int x = Integer.parseInt(st[0]);
            int y = Integer.parseInt(st[1]);
            for(int j = y; j < y+ 10; j++) {
                for(int k = x; k < x+10; k++) {
                    arr[j][k] =1;
                }
            }
        }

        int cnt = 0;
        for(int i = 1; i < arr.length; i++) {
            for(int j = 1; j < arr[0].length; j++) {
                if(arr[i][j] == 1) cnt++;
            }
        }

        System.out.println(cnt);
    }
}
