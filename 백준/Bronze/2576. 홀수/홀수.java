import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tot = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 7; i++) {
            int temp = Integer.parseInt(br.readLine());
            
            if(temp % 2 == 1) {
                tot += temp;
                if(temp < min) min = temp;
            }
        }
        
        if(tot == 0) {
            System.out.println("-1");
        } else {
            System.out.println(tot);
            System.out.println(min);
        }
    }

}