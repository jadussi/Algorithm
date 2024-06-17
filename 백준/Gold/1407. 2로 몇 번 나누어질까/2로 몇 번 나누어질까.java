import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        long st = Long.parseLong(str[0]);
        long end = Long.parseLong(str[1]);
        
        long endSum = calculateSum(end);
        long stSum = calculateSum(st - 1);
        
        System.out.println(endSum - stSum);
    }
    
    private static long calculateSum(long num) {
        long sum = 0;
        long i = 2;
        long j = 1;
        
        while (i <= num) {
            sum += (num / i) * j;
            i *= 2;
            j *= 2;
        }
        
        sum += num;
        return sum;
    }
}