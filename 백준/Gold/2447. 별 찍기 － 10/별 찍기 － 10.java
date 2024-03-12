import java.io.*;
public class Main {

    static char[][] strs;
    static boolean[][] tf;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        tf = new boolean[num][num];

        strs = new char[num][num];
        for(int i = 0; i < strs.length; i++) {
            for(int j = 0; j < strs.length; j++) {
                strs[i][j] = '*'
                ;
            }
        }

        recursive(0, num, 0 ,num);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < num; i++) {
            bw.write(strs[i]);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        System.out.println(bw);
    }

    static void recursive(int stL, int endL, int stR, int endR) {
        // 중간
        int len = endL-stL;
        int ls = stL + len/3;
        int le = stL + len/3*2;

        int rs = stR + len/3;
        int re = stR + len/3*2;

        // 삭제
        for(int i= ls ; i < le; i++) {
            for(int j = rs; j < re; j++) {
                strs[i][j] = ' ';
            }
        }

        // 현재 길이에서 삼등분 한 값은
        int incre = len/3;
        if(len == 3 ) return;
        for(int i = stL; i < endL; i+=incre) {
            for(int j = stR; j < endR; j+=incre) {
                recursive(j, j+incre, i, i+incre);
            }
        }

    }
}
