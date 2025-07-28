package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Treasure {
    public static void main(String[] args) throws Exception{
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 백준 문제는 입력을 띄어쓰기로 구분하는 경우가 있기 때문에 StringTokenizer 사용
        int M = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] a = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        str = br.readLine();
        int[] b = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        int[][] pairs = new int[M][2];
        Arrays.sort(a);
        for(int i=0; i<M; i++) {
            pairs[i][0] = i;
            pairs[i][1] = b[i];
        }
        Arrays.sort(pairs, (x, y) -> Integer.compare(y[1], x[1]));

        int[] c = new int[M];
        for(int i=0; i<M; i++) {
            c[pairs[i][0]] = a[i];
        }

        int sum = 0;
        for(int i=0; i<M; i++) {
            sum += c[i] * b[i];
        }

        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum)); // 버퍼에 넣을 내용
        bw.flush(); // 내용 출력
        bw.close(); // 종료
    }
}
