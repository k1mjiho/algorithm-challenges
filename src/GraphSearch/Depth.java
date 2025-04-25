package GraphSearch;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * DFS 깊이 우선 탐색 : 깊은 부분을 우선적으로 탐색하는 알고리즘
 * 스택 자료구조(or 재귀함수)를 이용
 *
 * 1. 탐색 시작 노드를 스택에 삽입하고 방문 처리
 * 2. 스택의 최상단 노드에 방문하지 않은 노드 O > 노드를 스택에 넣고 방문처리,
 * 방문하지 않은 노드 X > 최상단 노드 pop()
 * 3. 더 이상 2번의 과정을 수행할 수 없을 때까지 반복
 * */
public class Depth {
    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void main(String[] args) {
        graph.add(new ArrayList<>()); // 0번 노드 (빈 리스트)

        graph.add(new ArrayList<>(Arrays.asList(2, 3, 8))); // 1번 노드
        graph.add(new ArrayList<>(Arrays.asList(1, 7)));    // 2번 노드
        graph.add(new ArrayList<>(Arrays.asList(1, 4, 5))); // 3번 노드
        graph.add(new ArrayList<>(Arrays.asList(3, 5)));    // 4번 노드
        graph.add(new ArrayList<>(Arrays.asList(3, 4)));    // 5번 노드
        graph.add(new ArrayList<>(Arrays.asList(7)));       // 6번 노드
        graph.add(new ArrayList<>(Arrays.asList(2, 6, 8))); // 7번 노드
        graph.add(new ArrayList<>(Arrays.asList(1, 7)));    // 8번 노드

        dfs(1);
    }

    public static int dfs(int node) {
        visited[node] = true; // 현재 노드 방문 처리
        System.out.print(node + " ");

        // 현재 노드와 연결된 다른 노드를 재귀적으로 방문
        for(int next : graph.get(node)) {
//            if(!visited[next])
        }
        return 1;
    }
}
