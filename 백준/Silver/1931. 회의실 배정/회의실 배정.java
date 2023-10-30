import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<long[]> array;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        long[][] arr = new long[cnt][2];

        for(int i = 0; i < cnt; i++) {
            String[] st = br.readLine().split(" ");
            arr[i][0] = Long.parseLong(st[0]);
            arr[i][1] = Long.parseLong(st[1]);
        }
        array = new ArrayList<>();
        Arrays.sort(arr, (a,b) -> {
            if(a[1] > b[1]) return 1;
            else if(a[1] == b[1]) {
                if(a[0] < b[0]) return -1;
                else return 1;
            } else {
                return -1;
            }
        });
        array.add(arr[0]);
        for(int i = 1; i < arr.length; i++) {
            if(array.get(array.size()-1)[1] <= arr[i][0]) {
                array.add(arr[i]);
            }
        }
        System.out.println(array.size());
    }

}
