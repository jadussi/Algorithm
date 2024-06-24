import java.io.*;
public class Main {
    
    // 구한 두개의 수 최대공약수인지 다시 한번 검증
    public static long gcd(long a, long b) {
        if(a % b  == 0) {
            return b;
        } else {
            return gcd(b, a%b);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        long max = Long.parseLong(str[0]);
        long min = Long.parseLong(str[1]);

        long minMax = max*min;
        long minValue = Long.MAX_VALUE;
        long l = Long.MAX_VALUE;
        long r = Long.MAX_VALUE;
        for(long i = max; i*i <= minMax; i +=max) {
            if(minMax % i == 0) {
                if(gcd(i, minMax/i) == max) {
                    if(minValue > i+ (minMax/i)) {
                        minValue = i+ (minMax/i);
                        l = i;
                        r = minMax/i;
                    }

                }
            }
        }
        System.out.println(Math.min(l,r)+" "+Math.max(l,r));
    }
}
