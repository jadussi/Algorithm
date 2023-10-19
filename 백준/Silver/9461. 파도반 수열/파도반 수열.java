import java.io.*;

public class Main {

    static long[] fib;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] arr = new int[num];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i <num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(max < arr[i]) max = arr[i];
        }

        fib = new long[max+1];
        dp(max);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            sb.append(fib[arr[i]]+"\n");
        }
        
        System.out.println(sb.toString());
    }

    static void dp(int n) {
        if(n >= 6) {
            for(int i = 1; i <= 5; i++) {
                if(i == 1 || i == 2 || i == 3) {
                    fib[i] = 1;
                } else {
                    fib[i] = 2;
                }
            }
            for(int i = 6; i <= n; i++) {
                fib[i] = fib[i-1] + fib[i-5];
            }
        } else {
            for(int i = 1; i <= n; i++) {
                if(i == 1 || i == 2 || i == 3) {
                    fib[i] = 1;
                } else {
                    fib[i] = 2;
                }
            }
        }
    }
}
