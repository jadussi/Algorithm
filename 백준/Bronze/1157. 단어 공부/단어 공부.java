import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String args[]) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        
        input = input.toUpperCase();
        
        int[] alpha = new int[26];
        
        for(int i = 0; i < input.length(); i++) {
            alpha[input.charAt(i)-65]++;
        }
        
        int max = -1;
        int rtn = 0;
        
        for(int i = 0; i < alpha.length; i++) {
            if(alpha[i] > max) {
                max = alpha[i];
                rtn = i + 65;
            } else if(alpha[i] == max) {
                rtn = 63;
            }
        }
        
        System.out.print((char)rtn);
    }
}