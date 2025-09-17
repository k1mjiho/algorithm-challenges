import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String row = br.readLine();
        String[] arr = row.split(" ");

        double sum = 0;
        for(String s : arr) {
            sum += Double.parseDouble(s);
        }

        String grade;
        double avg = (double) sum/N;
        avg = Math.round(avg*10)/10.0;

        if(avg >= 4.0) {
            grade = "Perfect";
        }else if(avg >= 3.0) {
            grade = "Good";
        }else {
            grade = "Poor";
        }

        System.out.println(avg);
        System.out.println(grade);


    }
}