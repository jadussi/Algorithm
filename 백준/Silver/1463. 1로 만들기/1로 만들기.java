import java.util.Scanner;

public class Main {
    static Integer[] arr ;
    static int num;

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();
        arr = new Integer[num+1];
        arr[0] = 0;
        arr[1] = 0;
        if(num >= 2) {
            arr[2] = 1;
            if(num>=3) {
                arr[3] =1;
            }
            dp(num);
        }
        System.out.println(arr[num]);
    }

    static void dp(int n) {
        for(int i = 4; i <= n; i++) {
            if(i % 6 == 0) {
                arr[i] = Math.min(arr[i-1],Math.min(arr[i/3], arr[i/2]))+1;
            } else if(i % 3 == 0) {
                arr[i] = Math.min(arr[i-1], arr[i/3])+1;
            } else if(i % 2 == 0) {
                arr[i] = Math.min(arr[i-1], arr[i/2]) +1;
            } else {
                arr[i] = arr[i-1]+1;
            }
        }
    }
}
