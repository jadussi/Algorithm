import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        
        int befoNum = 0;
        int tot = 0;
        
        for(int i = 0; i < str.length; i++) {
            if(str[i].equals("1")) {
                befoNum += 1;
                tot += befoNum;
            } else {
                befoNum = 0;
            }
        }
        
        System.out.println(tot);
    }
}