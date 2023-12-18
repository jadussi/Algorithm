import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int tot = 0;
        int cal = 10;
        int size = 1;

        for(int i = 1; i <=num; i++) {
            if(i % cal == 0) {
                size++;
                cal *= 10;
            }
            tot += size;
        }
        System.out.println(tot);
    }
}
