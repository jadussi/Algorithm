import java.util.Scanner;

public class Main {
    static int recurCnt = 1;
    static int dpCnt = 0;
    static int[] dpArr;
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        dpArr = new int[num+1];

        fibRecur(num);
        fib(num);
        System.out.println(recurCnt +" "+ dpCnt);
    }

    // 재귀
    static int fibRecur(int n) {
        if(n == 1 || n == 2) {
            return 1;
        } else {
            recurCnt++;
            return fibRecur(fibRecur(n-1) + fibRecur(n-2));
        }
    }

    // DP
    static void fib(int n) {
        dpArr[1] = 1;
        dpArr[2] = 1;
        for(int i = 3; i <= n; i++) {
            dpCnt++;
            dpArr[i] = dpArr[i-1]+dpArr[i-2];
        }
    }
}
