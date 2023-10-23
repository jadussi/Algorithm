import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int[] arr = new int[num];
        for(int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        int[] cp = new int[num];
        cp[0] = arr[0];

        int max = cp[0];

        for(int i = 1; i < num; i++) {
            cp[i] = Math.max(cp[i-1]+arr[i], arr[i]);
            max = Math.max(max,cp[i]);
        }

        System.out.println(max);

    }


}
