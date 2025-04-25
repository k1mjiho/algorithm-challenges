package Implementation;

import java.util.Scanner;

public class Night {
    public static void main(String[] args) {
        // 8 * 8 좌표평면
        // 나이트의 8가지 경로를 하나씩 확인
        Scanner sc = new Scanner(System.in);
        // 현재 나이트의 위치 입력받기
        String inputData = sc.nextLine();
        int row = inputData.charAt(1) - '0'; // 두번째 위치의 숫자
        int column  = inputData.charAt(0) - 'a' + 1; // 문자를 아스키형태로 바꾸고 - a + 1 >> 문자를 숫자로 나타낸 것

        System.out.println("row : " + inputData.charAt(1)  + " column : " + column);

        // 나이트가 이동할 수 있는 8가지 방향 정의
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};

        // 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
        int result = 0;
        for(int i = 0; i<8; i++) {
            // 이동하고자 하는 위치 확인
            int nx = row + dx[i];
            int ny = column + dy[i];
            // 해당 위치로 이동이 가능하다면 카운트 증가
            if(nx <= 1 || nx >= 8 || ny <= 1 || ny >= 8) {
                result++;
            }
        }
        System.out.println(result);
    }
}
