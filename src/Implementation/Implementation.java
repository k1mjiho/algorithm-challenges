package Implementation;

import java.util.Arrays;

public class Implementation {
    public static void main(String[] args) {
        // 구현 : 풀이를 떠올리는것은 쉽지만 소스코드로 옮기기 어려운 문제
        // 완전 탐색(brute force)
        // 2차원 공간을 행렬로 정의해서 사용
        /** 구조 템플릿
         for("조건") {
         if("이 조건이면 continue");
         if("경계값 벗어나면 break");
         상태 업데이트;
         }
         */

        // 예제 코드 : 방향이동
        // 예시 입력: U, R, D, L
        String[] commands = {"U", "R", "D", "L"};

        // 방향벡터 정의 : 명령어 기반으로 이동할 때
        int[] dx = {-1, 1, 0, 0}; // 상하좌우 : 행(세로)
        int[] dy = {0, 0, -1, 1}; // 그에 맞는 y축 변화량 : 열(가로)
        String[] dirs = {"U", "D", "L", "R"};

        int x = 0, y = 0;
        for(String command : commands) {
            // 현재 방향의 인덱스를 찾아서 dx/dy에 매핑 하는 것
            int idx = Arrays.asList(dirs).indexOf(command);
            System.out.println("command :  " + command + "   :   idx " + idx);
            // 다음 위치
            int nx = x + dx[idx];
            int ny = y + dy[idx];

            // 범위 조건 예시 (예: 5X5 맵)
            if(0 <= nx && nx < 5 && 0<= ny && ny < 5) {
                x = nx;
                y = ny;
            }
            System.out.println("최종 위치: (" + x + ", " + y + ")");
        }
    }
}
