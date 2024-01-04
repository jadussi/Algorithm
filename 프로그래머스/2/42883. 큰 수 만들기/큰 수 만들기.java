import java.util.*;
class Solution {
    public static Stack<Integer> stack = new Stack<>();
    public static int t = 0;
    
    public String solution(String number, int k) {
        String answer = "";
        String[] st = number.split("");
        int numLen = number.length();

        t = k;
        stack.add(Integer.parseInt(st[0]));
        int idx = 1;

        while(t > 0) {
            if(idx >= numLen) {
                stack.pop();
                t -= 1;
            } else {
                int comp = Integer.parseInt(st[idx]);
                fnCheck(comp);
                idx++;
            }
        }     
        if(idx != numLen-1) {
            for(int i = idx; i < st.length; i++) {
                stack.add(Integer.parseInt(st[i]));
            }
        }


        StringBuilder sb = new StringBuilder();
        int[] arr = new int[stack.size()];
        for(int i = arr.length-1; i >= 0; i--) {
            arr[i] = stack.pop();
        }
        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        answer = sb.toString();
            
        return answer;
    }
    
    public static void fnCheck(int num) {
        if(t == 0) return;
        while(t > 0 && !stack.isEmpty()) {
            if(stack.peek() < num) {
                stack.pop();
                t -= 1;
            } else {
                break;
            }
        }
        stack.add(num);
    }
}