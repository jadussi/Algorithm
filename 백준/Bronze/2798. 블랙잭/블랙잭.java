import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String param = br.readLine();
        StringTokenizer st= new StringTokenizer(param);
        int rep = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        String cards = br.readLine();
        int[] nums = new int[rep];
        st = new StringTokenizer(cards);
        for(int i = 0; i < rep; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = 0;
        loop:
        for(int i = 0; i < rep; i++) {
            for(int j = i+1; j<rep; j++) {
                for(int k = j+1; k <rep; k++) {
                    if(nums[i]+nums[j]+nums[k] > max && nums[i]+nums[j]+nums[k] <= M) {
                        max = nums[i]+nums[j]+nums[k];
                        if(max == M) {
                            break loop;
                        }
                    }
                }
            }
        }
        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();
        
    }
}
