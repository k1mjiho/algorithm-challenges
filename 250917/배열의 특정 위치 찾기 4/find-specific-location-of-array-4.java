import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String row = br.readLine();
        String[] arr = row.split(" ");

        int sum = 0;
        int cnt = 0;

        for(int i=0; i<arr.length; i++) {
            int tmp = Integer.parseInt(arr[i]);
            if(tmp == 0) break;
            if(tmp % 2 == 0) {
                sum += tmp;
                cnt++;
            }
        }
        System.out.print(cnt + " " + sum);
    }
}