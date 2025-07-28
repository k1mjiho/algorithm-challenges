package Greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Atm {
    public static void main(String[] args) throws Exception{
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 백준 문제는 입력을 띄어쓰기로 구분하는 경우가 있기 때문에 StringTokenizer 사용
        int M = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] nums = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        int[][] pairs = new int[M][2];
        for(int i=1; i<M+1; i++) {
            pairs[i-1][0] = i;
            pairs[i-1][1] = nums[i-1];
        }

        Arrays.sort(pairs, (a, b) -> a[1] - b[1]); // 오름차순으로 정렬 1, 2, 3..
//        Arrays.sort(pairs, (a, b) -> Integer.compare(b[1], a[1])); // 내림차순으로 정력 3, 2, 1...
        System.out.println(Arrays.deepToString(pairs));

        // 이제 누적합을 구하면 됨
        int sum = 0;
        int total = 0;
        for(int i=0; i<M; i++) {
            sum += pairs[i][1];
            total += sum;
        }

        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(total)); // 버퍼에 넣을 내용
        bw.flush(); // 내용 출력
        bw.close(); // 종료
    }
}
