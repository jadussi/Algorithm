import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int[][] tri = new int[num][num];
        int[][] cp = new int[num][num];
        for(int i = 0; i < num; i++) {
            String[] strArr = br.readLine().split(" ");
            for(int j = 0; j < strArr.length; j++) {
                tri[i][j] = Integer.parseInt(strArr[j]);
                cp[i][j] = Integer.parseInt(strArr[j]);
            }
        }

        for(int i = 1; i < num; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    cp[i][0] = cp[i - 1][0] + tri[i][0];
                } else {
                    cp[i][j] = Math.max(cp[i-1][j-1], cp[i-1][j]) + tri[i][j];
                }
                cp[i][j+1] =  cp[i-1][j] + tri[i][j+1];
            }
        }

        int max = 0;
        for(int i=0; i<num; i++) {
            if(max<cp[num-1][i])
                max=cp[num-1][i];
        }

        System.out.println(max);

    }
}
