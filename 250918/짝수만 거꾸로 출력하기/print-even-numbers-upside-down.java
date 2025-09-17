import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        for(int i=N-1; i>=0; i--) {
            int tmp = Integer.parseInt(arr[i]);
            if(tmp % 2 == 0) {
                System.out.print(tmp + " ");
            }
        }

    }
}