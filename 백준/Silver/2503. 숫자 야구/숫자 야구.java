import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        String[] num = new String[cnt];
        int[] str = new int[cnt];
        int[] ball = new int[cnt];

        int ans = 0;
        for(int i = 0; i < cnt; i++) {
            String[] tmp = br.readLine().split(" ");
            num[i] = tmp[0];
            str[i] = Integer.parseInt(tmp[1]);
            ball[i] = Integer.parseInt(tmp[2]);
        }

        for(int a = 1; a < 10; a++) {
            for(int b = 1; b < 10; b++) {
                for(int c = 1; c < 10; c++) {
                    if(a == b|| b == c || a == c) continue;
                    int sum = 0;
                    for(int i = 0; i < cnt; i++) {
                        int strike = 0;
                        int bal = 0;
                        if(num[i].indexOf(String.valueOf(a)) == -1) {

                        } else if(num[i].indexOf(String.valueOf(a)) == 0) {
                            strike +=1;
                        } else {
                            bal +=1;
                        }

                        if(num[i].indexOf(String.valueOf(b)) == -1) {

                        } else if(num[i].indexOf(String.valueOf(b)) == 1) {
                            strike +=1;
                        } else {
                            bal +=1;
                        }
                        if(num[i].indexOf(String.valueOf(c)) == -1) {

                        } else if(num[i].indexOf(String.valueOf(c)) == 2) {
                            strike +=1;
                        } else {
                            bal +=1;
                        }
                        
                        if(str[i] == strike && bal == ball[i]){
                            sum +=1;
                        } else {
                            break;
                        }
                    }
                    if(sum == cnt ) ans +=1;
                }

            }
        }

        System.out.println(ans);
    }
}
