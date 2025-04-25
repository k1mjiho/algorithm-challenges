package GraphSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * BFS 너비 우선 탐색 : 가까운 노드부터 우선적으로 탐색하는 알고리즘
 * 큐 자료구조를 이용
 *
 * 1. 탐색 시작 노드를 큐에 삽입하고 방문 처리
 * 2. 큐에서 노드를 꺼낸 뒤
 * 해당 노드의 인접 노드 중 방문하지 않은 노드를 모두 큐에 삽입 하고 방문처리
 * 3. 더 이상 2번의 과정을 수행할 수 없을 때까지 반복
 * */
public class Breadth {
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

        bfs(1);
    }

    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " "); // 방문 노드 출력

            for (int next : graph.get(node)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }

}
