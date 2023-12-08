import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();
        int tot = 0;
        for(int i = 0; i < 9; i++) {
            int temp = Integer.parseInt(br.readLine());
            tot += temp;
            arr.add(0,temp);
        }
        Collections.sort(arr, (a,b) -> {
            if(a > b) return -1;
            else return 1;
        });

        boolean bb = true;
        int a = 0;
        int b = 0;
        for(int i = 0; i < 9; i++) {
            for(int j = i+1; j < 9; j++) {
                if(tot - arr.get(i) -arr.get(j) == 100) {
                    a = i; b = j;
                    bb = false;
                }
                if(!bb) break;
            }
            if(!bb) break;
        }

        arr.remove(a);
        arr.remove(b-1);
        Collections.sort(arr);

        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
