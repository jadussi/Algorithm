import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int cnt = Integer.parseInt(br.readLine());
        for(int i = 0; i < cnt; i++){
            long num = Long.parseLong(br.readLine());
            String tmp = "YES";
            for(int j = 2; j <=1000000; j++) {
                if(num % j == 0) {
                    tmp = "NO";
                    break;
                }
            }
            sb.append(tmp+"\n");
        }
        System.out.println(sb.toString());

    }
}
