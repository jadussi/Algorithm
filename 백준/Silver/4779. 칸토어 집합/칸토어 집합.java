import java.io.*;
import java.util.*;

public class Main {

    static StringBuilder stSb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str ;
        while((str= br.readLine()) != null) {
            int num = Integer.parseInt(str);

            stSb = new StringBuilder();
            for(int j = 0; j < (int)Math.pow(3,num); j++) {
                stSb.append("-");
            }

            cantorUnion(0, stSb.length());
            sb.append(stSb);
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }

    static void cantorUnion(int st, int end) {
        if(end-st < 3) return;

        int rmSt = st +(end-st)/3;
        //int rmSt = end/3;
        int rmEnd = st +(end-st)/3*2;
        //int rmEnd = end/3*2;

        // 지우기 시작
        for(int i = rmSt; i < rmEnd; i++) {
            stSb.setCharAt(i, ' ');
        }

        cantorUnion(st, rmSt);
        cantorUnion(rmEnd, end);
    }
}
