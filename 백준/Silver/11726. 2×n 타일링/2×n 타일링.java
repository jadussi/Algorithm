import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // n 입력 받기
        int n = scanner.nextInt();
        
        // dp 배열 초기화
        int[] dp = new int[n + 1];
        
        // 초기값 설정
        dp[1] = 1;
        if (n >= 2) dp[2] = 2;
        
        // 동적 프로그래밍 수행
        for (int i = 3; i <= n; i++) {
            // 현재 위치에 오는 방법은 이전 위치에서 1칸을 올라오는 경우와 2칸을 올라오는 경우의 수를 합한 것이다.
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }
        
        // 결과 출력
        System.out.println(dp[n]);
        
        scanner.close();
    }
}
