import java.util.*;

public class Dictionary {

    public static void Test(String[] args) {

        String str = "123456789";
        // string[] > int[]
        int[] nums = Arrays.stream(str.split("")).mapToInt(Integer::parseInt).toArray();

        // ArrayList 정렬
        ArrayList<Integer> list = new ArrayList<>();
        Collections.sort(list); // 오름차순 12345
        Collections.sort(list, Collections.reverseOrder()); // 내림차순 54321

        // HashSet : 중복 자동 제거, 순서 불필요, 빠른탐색
        Set<Integer> set = new HashSet<>();
        Set<Integer> rightArr = new HashSet<>(Arrays.asList(3,6,9)); // 선언과 동시에 초기화
        set.remove("지우고 싶은 set안의 값"); // 이거 할때 idx값이 유동적이니까(set의 사이즈가 계속 달라짐) 뭐가 맞는지 잘 판단해보고 하기!
        // ArrayList : 순서 중요, 인덱스로 접근, 중복허용
        ArrayList<Integer> list2 = new ArrayList<>();

        // keypad 3*3(N*N) 양손 시작할때 거리 구하기
        int number = 11; // 현재 손 위치
        int left = 0; // 왼손 시작점
        int right = 0; // 오른손 시작점
        // 절댓값 / 3 : 상하     ||    절댓값 % 3 : 좌우 (여기서 3은 N)
        int left_dis = (Math.abs(number - left) / 3) + (Math.abs(number - left) % 3);
        int right_dis =(Math.abs(number - right) / 3) + (Math.abs(number - right) % 3);

        // 맨해튼 거리 = |x1 - x2| + |y1 - y2|
        // 1. 상하좌우로만 이동이 가능한 상황 (대각선 XX)
        // 이동 비용이 방향과 상관없이 고정일때 (예:상하좌우 모두 1칸씩만 가능) (각 방향마다 비용다르면 XX)
        // 두 지점 사이의 가로/세로 이동 거리의 합
        // 즉, 대각선 이동 없이 블록 단위로만 이동할 때 사용하는 거리 계산법

    }

    public static void Stack() {
        // stack 구현
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(7);
        stack.pop(); // 삭제
        stack.push(1);
        stack.push(4);
        stack.pop();

        // 스택 최상단 원소부터 출력
        while(!stack.empty()) {
            System.out.print(stack.peek() + " "); // peek : 최상단 메소드 출력 사라지진않음
            stack.pop();
        }

    }

    // 선입선출 : 먼저 들어 온 데이터가 먼저 나가는 형식
    public static void Queue() {
        Queue<Integer> queue = new LinkedList<>(); // 연결리스트로 구현

        queue.offer(5);
        queue.offer(2);
        queue.offer(3);
        queue.offer(7);
        queue.poll(); // 삭제
        queue.offer(1);
        queue.offer(4);
        queue.poll();

        // 먼저 들어온 원소부터 추출
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) {
        int[] reserve = {1, 2, 3, 4, 5};

    }
}
