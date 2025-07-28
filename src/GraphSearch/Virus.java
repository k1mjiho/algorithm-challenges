package GraphSearch;

import java.io.*;
import java.util.*;

/**
 * 처음엔 BFS 라고 생각했지만 DFS 였다.
 * */
public class Virus {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int count = 0; // 감염된 컴퓨터 수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 백준 문제는 입력을 띄어쓰기로 구분하는 경우가 있기 때문에 StringTokenizer 사용
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        // 그래프 초기화
        graph = new ArrayList[N + 1]; // 컴퓨터번호 1부터 시작이라
        for (int i = 0; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a); // 양방향
        }

        visited = new boolean[N + 1];

        dfs(1);

        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count - 1)); // 버퍼에 넣을 내용
        bw.flush(); // 내용 출력
        bw.close(); // 종료
    }

    static void dfs(int node) {
        // 여긴 감염된 컴퓨터만 들어오니까 무조건 ++
        visited[node] = true;
        count++;

        for(int next : graph[node]) {
            if(!visited[next]) {
                dfs(next);
            }
        }
    }
}
