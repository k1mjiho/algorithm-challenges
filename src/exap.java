import java.util.*;

public class exap {

    class Solution {
        private static final int[] dx = {-1, 0};
        private static final int[] dy = {0, -1};

        public int solution(int[][] board) {
            int answer = 0;
            int n = board.length;
            int[][] max = new int[n][n];
            int[][] min = new int[n][n];

            // 시작값 초기화
            max[0][0] = board[0][0];
            min[0][0] = board[0][0];

            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    if(i==0 && j==0) continue;

                    int maxVal = 0;
                    int minVal = 0;
                    int value = board[i][j]; // 해당 좌표의 값

                    // 좌표 움직이기
                    for(int d=0; d<2; d++) {
                        int nx = i + dx[d];
                        int ny = j + dy[d];
                        if(nx < 0 || ny < 0) continue;

                        int prevMax = max[nx][ny];
                        int prevMin = min[nx][ny];

                        if(value != 0) {
                            // 부호 유지
                            maxVal = Math.max(maxVal, prevMax + value);
                            minVal = Math.min(minVal, prevMin + value);
                        }else{
                            // 유지
                            maxVal = Math.max(maxVal, prevMax);
                            minVal = Math.min(minVal, prevMin);

                            // 부호 바꿈
                            maxVal = Math.max(maxVal, -prevMin);
                            minVal = Math.min(minVal, -prevMax);
                        }
                    }

                    max[i][j] = maxVal;
                    min[i][j] = minVal;
                }
            }

            answer = Math.max(max[n-1][n-1], min[n-1][n-1]);
            return answer;
        }
    }
}
