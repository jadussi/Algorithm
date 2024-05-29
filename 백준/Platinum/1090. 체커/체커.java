import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cnt = Integer.parseInt(br.readLine());
        
        // 두개 좌 표
        int[][] xy = new int[cnt][2];
        
        // 왼쪽, 오른쪽 숫자
        int[] l = new int[cnt];
        int[] r = new int[cnt];
        
        int[] ans = new int[cnt];
        // 배열 초기값 설정
        Arrays.fill(ans, Integer.MAX_VALUE);

        // 값을 입력받기
        for(int i = 0; i < cnt; i++) {
            String[] st = br.readLine().split(" ");
            int templ = Integer.parseInt(st[0]);
            int tempr = Integer.parseInt(st[1]);
            l[i] = templ;
            r[i] = tempr;
            xy[i][0] = templ;
            xy[i][1] = tempr;
        }

        // 최소거리 계산
        // 이중 반복문을 통해 비교하고자 하는 지점 선택
        for(int i = 0; i < l.length; i++) {
            for(int j = 0; j < r.length; j++) {

                // 선택한 지점에서 입력 받은 각 지점에 대한 거리 계산
                int[] temp = new int[cnt];
                for(int k = 0; k < cnt; k++) {
                    temp[k] = Math.abs(l[i]-xy[k][0]) + Math.abs(r[j]-xy[k][1]);
                }

                // 현재 지점에 대해서 가장 가까이에 있는 거리 계산
                // 정렬을 통해 계산한다.
                Arrays.sort(temp);

                // 만나야 하는 점의 수만큼 최소 이동을 하는 경우 정답에 대입
                int sum = 0;
                for(int k = 0; k < cnt; k++) {
                    sum += temp[k];
                    ans[k] = Math.min(ans[k], sum);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ans.length;  i++) {
            sb.append(ans[i] + " ");
        }

        System.out.println(sb.toString());
        
    }
}
