package GraphSearch;

import java.io.*;

public class Safe {

    public static int N;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 백준 문제는 입력을 띄어쓰기로 구분하는 경우가 있기 때문에 StringTokenizer 사용
        N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        int answer = 0;
        int maxHeight = 0;

        for(int i=0; i<N; i++) {
            // 한 줄 입력받고 공백 기준으로 나눔
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(input[j]);
                maxHeight = Math.max(maxHeight, map[i][j]);
            }
        }

        // 로직
        // 해당 높이에 잠긴거면 1 아니면 0
        int max = 0;
        for(int i=0; i<=maxHeight; i++) {
            int[][] arr = new int[N][N];
            for (int j =0; j<N; j++) {
                for (int k = 0; k<N; k++) {
                    int height = map[j][k];
                    arr[j][k] = height < i ? 1 : 0;
                }
            }

            // 강수량 높이 마다 안전영역의 갯수를 구한다.
            int count = 0;
            boolean[][] visited = new boolean[N][N];
            for (int x =0; x<N; x++) {
                for (int y =0; y<N; y++) {
                    if(arr[x][y] == 0 && !visited[x][y]) {
                        dfs(x, y, arr, visited);
                        count++;
                    }
                }
            }
            max = Math.max(max, count);
        }

        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(answer)); // 버퍼에 넣을 내용
        bw.flush(); // 내용 출력
        bw.close(); // 종료
    }

    static void dfs(int x, int y, int[][] arr, boolean[][] visited) {
        visited[x][y] = true;

        for(int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < N && ny < N &&
                    !visited[nx][ny] && arr[nx][ny] == 0) {
                dfs(nx, ny, arr, visited);
            }
        }
    }
}
