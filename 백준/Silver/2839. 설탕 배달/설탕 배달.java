import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args)  {

        Scanner scan = new Scanner(System.in);

        int[] sugar = new int[]{3,5};

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>());
        arr.add(new ArrayList<>());

        int n = scan.nextInt();

        int rmn = n;

        boolean tf1 = true;
        boolean tf2 = true;

        if(rmn % 3 != 0) {
            for(int i = 0; i < rmn/3; i++) {
                arr.get(0).add(3);
            }
            rmn = rmn % 3;
            while (true) {
                if(rmn % 5 == 0) {
                    for(int i = 0; i < rmn/5; i++) {
                        arr.get(0).add(5);
                    }
                    break;
                } else {
                    if(arr.get(0).size() == 0) {
                        tf1 = false;
                        break;
                    } else {
                        arr.get(0).remove(arr.get(0).size()-1);
                        rmn += 3;
                    }
                }
            }
        } else {
            for(int i = 0; i < rmn/3; i++) {
                arr.get(0).add(3);
            }
        }
        rmn = n;
        if(rmn % 5 != 0) {
            for(int i = 0; i < rmn/5; i++) {
                arr.get(1).add(5);
            }
            rmn = rmn % 5;
            while (true) {
                if(rmn % 3 == 0) {
                    for(int i = 0; i < rmn/3; i++) {
                        arr.get(1).add(3);
                    }
                    break;
                } else {
                    if(arr.get(1).size() == 0) {
                        tf2 = false;
                        break;
                    } else {
                        arr.get(1).remove(arr.get(1).size()-1);
                        rmn += 5;
                    }
                }
            }
        } else {
            for(int i = 0; i < rmn/5; i++) {
                arr.get(1).add(5);
            }
        }

        if(!tf1 && !tf2) {
            System.out.println(-1);
        } else {
            System.out.println(Math.min(arr.get(0).size(), arr.get(1).size()));
        }

    }
}
