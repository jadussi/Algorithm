import java.io.*;

public class Main {

    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int[] nums = new int[6];

        for(int i = 0; i < nums.length;i++) {
            nums[i] = Integer.parseInt(str[i]);
        }
        boolean tf = false;
        for(int i = -999; i <1000; i++) {
            for(int j = -999; j < 1000; j++) {
                if(i*nums[0] + j*nums[1] == nums[2] && i*nums[3] + j*nums[4] == nums[5]) {
                    System.out.println(i+ " " +j);
                    tf = true;
                    break;
                }
                if(i*nums[1] + j*nums[0] == nums[2] && i*nums[4] + j*nums[3] == nums[5]) {
                    System.out.println(j+ " " +i);
                    tf = true;
                    break;
                }
            }
            if(tf) break;
        }

    }
}
