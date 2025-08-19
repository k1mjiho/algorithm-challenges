package barkingdog.experience;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_2577 {

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 백준 문제는 입력을 띄어쓰기로 구분하는 경우가 있기 때문에 StringTokenizer 사용
//        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        // 로직
        int[] arr = new int[10];
        Arrays.fill(arr, 0); // 요것이 핵심
        String sum = String.valueOf(a*b*c);
        for(String s : sum.split("")) {
            int i = Integer.parseInt(s);
            arr[i] += 1;
        }

        for(int i : arr) {
            System.out.println(i);
        }
        // 출력
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(Arrays.toString(arr)); // 버퍼에 넣을 내용
//        bw.flush(); // 내용 출력
//        bw.close(); // 종료
    }
}
