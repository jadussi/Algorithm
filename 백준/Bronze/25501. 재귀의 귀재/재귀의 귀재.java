import java.io.*;
public class Main {
    static int[][] res ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        String[] strs = new String[cnt];
        res = new int[cnt][2];
        for(int i = 0; i < cnt; i++) {
            strs[i] = br.readLine();
        }

        for(int i = 0; i < cnt; i++) {
            isPalindrome(strs[i],0, strs[i].length()-1, 1, i);
        }

        for(int i = 0; i < res.length; i++) {
            bw.write(res[i][0]+" ");
            bw.write(res[i][1] +"\n");
        }
        bw.flush();
        bw.close();
        System.out.println(bw);

    }

    static void isPalindrome(String str, int st, int end, int cnt, int resIdx) {
        if(st >= end) {
            res[resIdx][0] = 1;
            res[resIdx][1] = cnt;
        } else if(str.charAt(st) != str.charAt(end)) {
            res[resIdx][0] = 0;
            res[resIdx][1] = cnt;
        } else {
            isPalindrome(str, st+1, end -1, cnt+1, resIdx);
        }
    }
}
