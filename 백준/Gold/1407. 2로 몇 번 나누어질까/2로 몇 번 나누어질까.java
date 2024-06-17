import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        long st = Long.parseLong(str[0]) - 1; // 여기에서 바로 -1 처리
        long end = Long.parseLong(str[1]);

        // 초기값 설정
        long stSum = 0;
        long endSum = 0;
        
        // endSum 계산
        long i = 2;
        long j = 1;
        while (i <= end) {
            endSum += (end / i) * j;
            i *= 2;
            j *= 2;
        }
        endSum += end;

        // stSum 계산
        i = 2;
        j = 1;
        while (i <= st) {
            stSum += (st / i) * j;
            i *= 2;
            j *= 2;
        }
        stSum += st;

        // 결과 출력
        System.out.println(endSum - stSum);
    }
}
