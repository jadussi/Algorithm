import java.io.*;

public class Main {
    
    static long res = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int go = Integer.parseInt(br.readLine());
        if(go > 0) {
            res = go;
            recursive(go);
        } else {
            res = 1;
        }

        System.out.println(res);
    }

    static void recursive(int num) {
        int i = num -1;
        if(i > 0) {
            res *= i;
            recursive(i);
        }
    }
}