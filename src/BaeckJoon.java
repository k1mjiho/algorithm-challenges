import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaeckJoon {
    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 백준 문제는 입력을 띄어쓰기로 구분하는 경우가 있기 때문에 StringTokenizer 사용
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 로직


        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf("")); // 버퍼에 넣을 내용
        bw.flush(); // 내용 출력
        bw.close(); // 종료
    }
}
