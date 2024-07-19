import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] ll = new int[n];
        int[] ll2 = new int[n];


        String[] st1 = br.readLine().split(" ");
        String[] st2 = br.readLine().split(" ");

        for(int i = 0; i < n; i++) {
            ll[i] = Integer.parseInt(st1[i]);
            ll2[i] = Integer.parseInt(st2[i]);
        }

        Arrays.sort(ll);
        Arrays.sort(ll2);

        int sum = 0;
        for(int i = 0; i < n; i++) {
            int cal = ll[i] * ll2[n-1-i];
            sum +=cal;
        }
        System.out.println(sum );


    }
}
