import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int a = 0;

        for(int i= 1; i<= num; i++) {
            for(int j = 1; j<= num; j++) {
                for(int k =1; k <= num; k++) {
                    if(i+j+k == num) {
                        if(i >= j+2) {
                            if(i > 0 && j > 0 && k >0) {
                                if(k % 2 ==0) {
                                    a +=1;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(a);
    }
}
