package barkingdog.experience;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
* 일단 알파벳 갯수만큼의 사이즈로 배열을 초기화 하고
* 주어진 알파벳을 인덱싱하여 ++ 하기
* */
public class Boj_10808 {

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 백준 문제는 입력을 띄어쓰기로 구분하는 경우가 있기 때문에 StringTokenizer 사용
        StringTokenizer st = new StringTokenizer(br.readLine());
        String word = st.nextToken();

        // 로직
        int[] arr = new int[26];
        // 1. arr 모든 값 0으로 초기화
        Arrays.fill(arr, 0);
        // 2. 알파벳 숫자로 변환
        for(char s : word.toCharArray()) {
            int num = s - 'a';
            arr[num]++;
        }

        for(int i : arr) {
            System.out.print(i + " ");
        }

        // 출력
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(String.valueOf(Arrays.toString(arr))); // 버퍼에 넣을 내용
//        bw.flush(); // 내용 출력
//        bw.close(); // 종료
    }
}
