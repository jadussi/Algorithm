import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num; i++) {
            String str = br.readLine();
            Stack<Character> stack = new Stack<>();
            stack.add(str.charAt(0));

            for(int j=1; j < str.length();j++) {
                if(stack.size() > 0) {
                    if(stack.peek() != str.charAt(j)) {
                        if(stack.peek() != ')') {
                            stack.pop();
                        } else {
                            stack.add(str.charAt(j));
                        }
                    } else {
                        stack.add(str.charAt(j));
                    }
                } else {
                    stack.add(str.charAt(j));
                }
            }
            if(stack.size() == 0) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.println(sb);
    }
}
