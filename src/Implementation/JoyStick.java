package Implementation;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 프로그래머스 조이스틱(Greedy)
 * 20250424 - B
 * 20250425
 * */

public class JoyStick {
    public static void main(String[] args) {
        solution("JEROEN");
//        solution("JAN");
    }

    public static int solution(String name) {
        int answer = 0;
        int len = name.length();
        ArrayList<Integer> list = new ArrayList<>();

        // 1. 알파벳 > 숫자로 변환
        // 거꾸로도 갈 수 있으므로 절반 갈라서 생각
        for(char s : name.toCharArray()) {
            int num = s - 'A';
            if(num > 13) num = 26 - num;
            list.add(num);
            answer += num; // 일단 알파벳은 찾아가야하니까
        }

        // 2. 이제 최단 경로를 구해야하는데 커서 최대의 수
        int move = len -1;
        // 2-1. 이제 오른쪽으로 갈때와 왼쪽으로 갈때 다 구해서 세개중에 제일 최소값
        for(int i=0; i<len; i++) {
            int next = i+1;
            // 연속 A인 구간은 커서 이동
            while(next < len && list.get(next) == 0) next++;

            move = Math.min(move, i*2 + len - next);
            move = Math.min(move, (len - next)*2 + i);
        }

        return answer + move;
    }
}
