import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for(int j=0; j<4; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                sum += tmp;
            }
            if(sum/4 >= 60) {
                    System.out.println("pass");
                    cnt++;
            }else {
                    System.out.println("fail");
            }
        }
        System.out.println(cnt);
    }
}