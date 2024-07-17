import java.io.*;
import java.util.*;

public class Main {
    static int tempAns;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ll = new int[n];

        for(int i = 0; i < n; i++) {
            ll[i] = Integer.parseInt(br.readLine());
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i < n; i++) {
            arr.add(Math.abs(ll[i]-ll[i-1]));
        }
        tempAns = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            gcd(tempAns, arr.get(i));
        }

        ArrayList<Integer> ansList = new ArrayList<>();
        ansList.add(tempAns);

        // M은 1보다 커야함
        for(int i = 2; i < tempAns; i++) {
            if(tempAns % i == 0) {
                ansList.add(i);
            }
        }

        /*int h = (int)Math.sqrt(tempAns);
        if(h*h == tempAns) {
            ansList.add(h);
        }

        ansList.add((int)Math.pow(tempAns,2));*/
        ArrayList<Integer> rtn = new ArrayList<>();

        for(int i = 0 ; i < ansList.size(); i++) {
            if(makeM(ansList.get(i), ll)) {
                rtn.add(ansList.get(i));
            }
        }

        Collections.sort(rtn);
        for(int r : rtn) {
            System.out.print(r +" ");
        }
    }

    static boolean makeM(int tmp, int[] al) {
        int rmn = al[0] % tmp;
        for(int i = 1; i < al.length; i++) {
            if(al[i] % tmp != rmn) {
                return false;
            }
        }
        return true;
    }

    static void gcd(int a, int b) {
        if(a % b == 0) {
            tempAns = b;
            return;
        }
        gcd(b, a%b);
    }
}
