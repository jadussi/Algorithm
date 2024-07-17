import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arr = new ArrayList<>();
        while(true) {
            int tmp = Integer.parseInt(br.readLine());

            if(tmp == 0) break;
            arr.add(tmp);
        }

        int max = Collections.max(arr);
        int[] ll = new int[max *2 +1];

        // 숫자 채우기
        for(int i = 1; i < ll.length; i++) {
            ll[i] = i;
        }


        // 소수판별하기
        boolean[] tf = new boolean[ll.length];

        for(int i = 2; i*i<ll.length; i++) {
            if(!tf[i]) {
                for(int j = i*2; j < ll.length; j += i) {
                    tf[j] = true;
                }
            }
        }

        // 입력받은 숫자 n 보다 크고 2n보다 작거나 같은 갯수
        for(int i = 0; i < arr.size(); i++) {
            int tmp = arr.get(i);
            int cnt = 0;
            for(int j = tmp+1; j <= tmp*2; j++) {
                if(!tf[j]) cnt++;
            }
            System.out.println(cnt);
        }


    }
}
