import java.util.*;
import java.io.*;
public class Main {

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strs = br.readLine().split(" ");

        int[] arr = new int[Integer.parseInt(strs[0])+1];
        boolean[] visit = new boolean[arr.length];

        int jump = Integer.parseInt(strs[1]);
        for(int i = 1; i < arr.length; i++) {
            arr[i] = i;
            visit[i] = true;
        }

        Queue<Integer> queue = new LinkedList<>();

        int stIdx = 0;
        int moveCnt = 0;
        // queue 사이즈가 7 이하일 때 까지 반복 실행
        while(queue.size() != Integer.parseInt(strs[0])) {
            if(stIdx+1 < visit.length) {
                // 방문하지 않은 상태일 때
                if(visit[stIdx+1]) {
                    moveCnt++;
                    if(moveCnt == jump) {
                        visit[stIdx+1] = false;
                        queue.add(stIdx+1);
                        moveCnt = 0;
                    } else {
                        stIdx++;
                    }
                } else {
                    stIdx++;
                }
            } else {
                stIdx = 0;
            }
        }

        StringBuilder sb = new StringBuilder("<");
        while(queue.size() > 1) {
            sb.append(queue.poll()+", ");
        }
        sb.append(queue.poll()+">");

        System.out.println(sb);
    }
}
