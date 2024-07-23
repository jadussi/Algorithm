import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] str = new String[t];
        for(int i = 0; i < t; i++) {
            str[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++ ) {
            String tmp = str[i];
            int ed = tmp.length()-1;
            int st = 0;
            int cnt = 0;

            while (st <= ed ) {
                if(tmp.charAt(st) == tmp.charAt(ed)) {
                    st += 1;
                    ed -= 1;
                } else {
                    boolean l = chk(st+1, ed, tmp);
                    boolean r = chk(st,ed-1,tmp);
                    if(l||r) {
                        cnt = 1;
                    } else {
                        cnt = 2;
                    }
                    break;
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }

    static boolean chk(int st, int ed, String tar) {
        // 반레 abbax
        while(st <= ed) {
            if(tar.charAt(st) == tar.charAt(ed)) {
                st+=1;
                ed-=1;
            } else{
                return false;
            }
        }
        return true;
    }
}
