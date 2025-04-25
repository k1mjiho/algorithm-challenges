package GraphSearch;

import java.util.Stack;

/**
 * 프로그래머스 타겟넘버
 * DFS 깊이 우선 탐색 ( +- 트리구조로 생각)
 * */

public class TargetNumber {

    public static void main(String[] args) {
        Solution(new int[]{1, 1, 1, 1, 1}, 3); // 5
    }

    public static int Solution(int[] numbers, int target) {
//        return dfs(numbers, target, 0, 0);

        // 스택으로 풀기
        int answer = 0;

        // 상태값을 저장하는 클래스
        class Node {
            int depth;
            int sum;

            public Node(int depth, int sum) {
                this.depth = depth;
                this.sum = sum;
            }
        }

        Stack<Node> stack = new Stack<>();
        stack.push(new Node(0, 0));

        while (!stack.isEmpty()) {
            Node node = stack.pop();

            if (node.depth == numbers.length) {
                if (node.sum == target) {
                    answer++;
                }
                continue;
            }
            int nextDepth = node.depth + 1;
            stack.push(new Node(nextDepth, node.sum + numbers[node.depth]));
            stack.push(new Node(nextDepth, node.sum - numbers[node.depth]));
        }
        return answer;
    }

    // 재귀함수
    public static int dfs(int[] numbers, int target, int depth, int sum) {
        // 종료 조건 : 모든 숫자를 다 썼을 때
        if(depth == numbers.length) {
            return sum == target ? 1 : 0;
        }

        // 현재 숫자를 더해서 target을 만든 경우의 수
        int plus = dfs(numbers, target, depth+1, sum + numbers[depth]);
        // 현재 숫자를 빼서 target을 만든 경우의 수
        int minus = dfs(numbers, target, depth+1, sum - numbers[depth]);

        return plus + minus; // 전체 경우의 수
    }

}
