import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String row = br.readLine();

        String[] arr = row.split(" ");
        int sum = 0;
        double evg = 0.0;
        int cnt = 0;

        for(int i=0; i<arr.length; i++) {
            int tmp = Integer.parseInt(arr[i]);
            if(tmp >= 250) break;
            sum += tmp;
            cnt++;
        }

        evg = (double) sum / cnt;
        System.out.print(sum + " " + Math.round(evg*10) / 10.0);
    }
}