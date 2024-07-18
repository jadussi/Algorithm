import java.io.*;
import java.util.*;

public class Main {
    static boolean[] tf ;
    //static ArrayList<Integer> arr;
    static int[] arr;
    static int n;
    static int[] ll;
    public static void main(String[] args) {
        Scanner scan = new Scanner(new InputStreamReader(System.in));
        n = scan.nextInt();

        ll = new int[n];

        for(int i = 1; i <=n; i++) {
            ll[i-1] = i;
        }

        tf = new boolean[n];

        arr = new int[n];

        for(int i = 0; i < n; i++) {
            tf[i] = true;
            arr[0] = ll[i];
            func(1);
            tf[i] = false;
        }
    }

    static void func(int d) {
        if(d == n) {
            for(int i : arr) {
                System.out.print(i+" ");
            }
            System.out.println();
            //arr.remove(n-1);    // 마지막 요소 제거
            return;
        }

        for(int i = 0; i < n; i++) {
            if(!tf[i]) {
                tf[i] = true;
                //arr.add(ll[i]);
                arr[d] = ll[i];
                func(d+1);
                tf[i] = false;
            }
        }
        //arr.remove(arr.size()-1);
    }
}
