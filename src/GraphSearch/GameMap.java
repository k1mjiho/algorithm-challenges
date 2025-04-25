package GraphSearch;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 프로그래머스 게임 맵 최단거리
 * BFS 너비 우선 탐색
 * 제시된 조건을 다 만족할 때 Queue 삽입
 * visited[][] 배열 방문처리 (2차원 맵이므로)
 * 및 상하좌우 dx/dy 좌표 계산!!!
 * */
public class GameMap {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 0, 1, 1, 1},
                {1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 0, 1},
                {0, 0, 0, 0, 1}
        };
        Solution(arr);
    }

    public static int Solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int answer = 0;
        // 2차원 맵 탐색이니까
        boolean[][] visited = new boolean[maps.length][maps[0].length];

        /** 로직 */

        // 상하좌우 이동 좌표
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<int[]> queue = new LinkedList<>(); // 좌표 저장
        queue.offer(new int[]{0,0});
        visited[0][0] = true; // 시작 노드 방문

        /**
         * i = 0 → 상 (x-1, y)
         * i = 1 → 하 (x+1, y)
         * i = 2 → 좌 (x, y-1)
         * i = 3 → 우 (x, y+1)
         * */
        while (!queue.isEmpty()) {
            int[] now = queue.poll(); // 현재 위치
            int x = now[0];
            int y = now[1];

            // 4 : 방향의 갯수 (상하좌우)
            for(int i=0; i< 4; i++) {
                // 현재 좌표에서 상하좌우 움직였을 시 좌표값 구하긔
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 범위 체크 + 벽이 아니고 + 방문 안한 경우만!
                if(nx >= 0 && ny >= 0 && nx < n && ny < m
                        && maps[nx][ny] == 1 && !visited[nx][ny]) {
                    queue.offer(new int[]{nx, ny}); // 길이면 큐에 삽입
                    visited[nx][ny] = true; // 해당 노드 방문 처리
                    maps[nx][ny] = maps[x][y] + 1; // 이동 거리 누적
                }
            }
        }

        answer = maps[n-1][m-1] == 1 ? -1 : maps[n-1][m-1];
        return answer;
    }
}