import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // Please write your code here.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String row = br.readLine();

        String[] arr = row.split(" ");
        int sum = 0;

        for(String i : arr) {
            sum += Integer.parseInt(i);
        }

        System.out.println(sum);
    }
}