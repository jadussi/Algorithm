import java.io.*;
public class Main {
    // 1. 카멜
    // 2. 스네이크
    // 3. 파스칼 (앞글자 대문자)

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        if(str[0].equals("1")) {
            // 카멜 append
            sb.append(str[1]+"\n");

            // 스네이크 append
            sb.append(str[1].charAt(0));
            for(int i = 1; i < str[1].length(); i++) {
                if(str[1].charAt(i) >= 65 && str[1].charAt(i) <= 90) {
                    sb.append("_");
                    sb.append(Character.toLowerCase(str[1].charAt(i)));
                } else {
                    sb.append(str[1].charAt(i));
                }
            }
            sb.append("\n");

            // 파스칼 append
            sb.append(Character.toUpperCase(str[1].charAt(0)));
            sb.append(str[1].substring(1));
        } else if(str[0].equals("2")) {
            String[] temp = str[1].split("_");
            // 카멜부터 시작
            sb.append(temp[0]);
            for(int i = 1; i < temp.length; i++) {
                sb.append(Character.toUpperCase(temp[i].charAt(0)));
                sb.append(temp[i].substring(1));
            }
            sb.append("\n");
            // 스네이크 그대로 append
            sb.append(str[1]+"\n");
            // 파스칼 append
            for(int i = 0; i < temp.length; i++) {
                sb.append(Character.toUpperCase(temp[i].charAt(0)));
                sb.append(temp[i].substring(1));
            }
        } else {
            // 카멜 append
            sb.append(Character.toLowerCase(str[1].charAt(0)));
            sb.append(str[1].substring(1)+"\n");

            // 스네이크 append
            sb.append(Character.toLowerCase(str[1].charAt(0)));
            for(int i = 1; i < str[1].length(); i++) {
                if(str[1].charAt(i) >= 65 && str[1].charAt(i) <= 90) {
                    sb.append("_");
                    sb.append(Character.toLowerCase(str[1].charAt(i)));
                } else {
                    sb.append(str[1].charAt(i));
                }
            }
            sb.append("\n");
            // 파스칼 append
            sb.append(str[1]);
        }

        System.out.println(sb);
    }
}
