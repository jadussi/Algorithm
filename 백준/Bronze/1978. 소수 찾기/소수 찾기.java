import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String[] st = br.readLine().split(" ");
        int[] num = new int[cnt];
        for(int i = 0; i < cnt; i++) {
            num[i] = Integer.parseInt(st[i]);
        }

        Arrays.sort(num);   // 입력받은 숫자 정렬
        Set<Integer> s = new HashSet<>();   // 소수를 담을 Set
        int[] ll = new int[num[cnt-1]+1];   // 가장 큰 수의 길이만큼 배열 생성

        // 배열 숫자로 채우기
        for(int i = 1; i < ll.length; i++) {
            ll[i] = i;
        }

        // 소수의 배수에 대해 방문 여부 처리를 위한 방문 배열 생성
        boolean[] tf = new boolean[ll.length];
        for(int i = 2; i < ll.length; i++) {
            if(!tf[i]) {    // 숫자가 미방문 일시
                s.add(i);   // 소수 set에  추가
                tf[i] = true;   // 방문처리
                int tmp = i;
                for(int j = i*2 ; j < ll.length; j+=tmp) {  // 해당 소수의 배수들 방문처리
                    tf[j] = true;
                }
            }

        }

        int ans = 0;

        for(int i = 0; i < num.length; i++) {
            if(s.contains(num[i])) ans++;
        }

        System.out.println(ans);

    }
}
