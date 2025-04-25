package Implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class StrReverse {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 백준 문제는 입력을 띄어쓰기로 구분하는 경우가 있기 때문에 StringTokenizer 사용
        StringTokenizer st = new StringTokenizer(br.readLine());
        String S = st.nextToken(); // 입력받은 문자열
        ArrayList<String> list = new ArrayList<>();
        String answer = "";
        int num = 0;
        // 로직
        for(char s : S.toCharArray()) {
            if(Character.isDigit(s)) { // char 형이 숫자가 맞는지 확인
                num += Character.getNumericValue(s);
            }else {
                list.add(String.valueOf(s));
            }
        }

        Collections.sort(list);
        for(String s : list) {
            answer += s;
        }

        answer += String.valueOf(num);

        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer); // 버퍼에 넣을 내용
        bw.flush(); // 내용 출력
        bw.close(); // 종료
    }
}
