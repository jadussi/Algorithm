import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        String[] str = new String[num];

        // 한줄 씩 가져오기
        for(int i = 0; i < num; i++) {
            str[i] = br.readLine();
        }

        // 완전탐색 시작
        for(int i = 0; i < num; i++) {
            String[] tmp = str[i].split(" ");
            int m = Integer.parseInt(tmp[0]);
            int n = Integer.parseInt(tmp[1]);
            int x = Integer.parseInt(tmp[2]);
            int y = Integer.parseInt(tmp[3]);

            sb.append(bf(m,n,x,y)+"\n");
        }

        System.out.println(sb);

    }

    // 최소공배수를 활용하여 반복할 횟수 구하기
    static int gcdMax(int m, int n) {
        int a = 0; int b =0;
        if(m > n) {
            a = m;
            b = n;
        } else if(m < n) {
            a = n;
            b = m;
        } else {
            return m*n;
        }

        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return (m*n)/a;
    }

    // 완전탐색
    static String bf(int m, int n, int x, int y) {
         int num = gcdMax(m,n); // 반복할 횟수 지정

        // x 에 맞춰서 풀이하기
        String answer = "-1";
        for(int i = x ; i <= num;) {
            int temp = i % n != 0 ? i % n : n;
            if(temp== y)  {
                answer = Integer.valueOf(i).toString();
                break;
            }
            i += m;
        }

        return answer;
    }

}
