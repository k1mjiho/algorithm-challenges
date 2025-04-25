import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        solution(5, new int[]{2,4}, new int[]{1, 3, 5}); // 5 출력
    }

    // 체육복 20분
    // 그리디는 그냥 단순하게 생각해 >> for문, while, 이중for문 !!!!!!!
    // for문으로 ArrayList 만들어 걍
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();

        // 로직
        for(int i : lost) lostSet.add(i); // 체육복 잃어버린 애들 Set
        // 1. 진짜로 체육복을 빌려줄 수 있는 애들만 reserveSet에 담는다.
        for(int r: reserve) {
            if(lostSet.contains(r)) {
                lostSet.remove(r);
            }else {
                reserveSet.add(r); // 빌려줄 수 있는 애들 Set
            }
        }
        // 2. greedy하게 양 옆 비교
        for(int i : reserveSet) {
            if(lostSet.contains(i - 1)) {
                lostSet.remove(i - 1);
            }else if(lostSet.contains(i + 1)) {
                lostSet.remove(i + 1);
            }
        }

        answer -= lostSet.size();
        return answer;
    }

    public static void ep1() throws IOException {
        int[] arr = {500, 100, 50, 10,5, 1};
        int count = 0;

        // 엔터로 구분해서 입력 받음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 백준 문제는 입력을 띄어쓰기로 구분하는 경우가 있기 때문에 StringTokenizer 사용
        StringTokenizer st = new StringTokenizer(br.readLine());
        int price = Integer.parseInt(st.nextToken()); // 낸 돈
        int n = 1000 - price;

        // 로직
        for (int i=0; i<arr.length; i++){
            count += n / arr[i];
            n %= arr[i];
        }

        // 로직2
//        while(N != 1) {
//            count++;
//            if(N % K == 0) {
//                N /= K;
//            }else {
//                N -= 1;
//            }
//        }

        // 로직3
        // 왼쪽에 있는 수가 0이 아니고 왼쪽보다 오른쪽이 크면 * 아니면 +
//        for(int i = 0; i<nums.length-1; i++){
//            if(nums[i] <= 1 || count <= 1){
//                count += nums[i+1];
//            }else {
//                count *= nums[i+1];
//            }
//        }

        // 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(count)); // 버퍼에 넣을 내용
        bw.flush(); // 내용 출력
        bw.close(); // 종료
    }
}