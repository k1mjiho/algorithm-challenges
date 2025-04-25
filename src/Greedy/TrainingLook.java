package Greedy;

import java.util.HashSet;
import java.util.Set;

public class TrainingLook {
    public static void main(String[] args) {
        Solution(5, new int[]{2, 4}, new int[]{1,3,5});
    }

    public static int Solution(int n, int[] lost, int[] reserve) {
        int answer  = n;
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();

        // 로직
        // 1. reserve, lost Set 세팅
        for(int l : lost) lostSet.add(l);
        for(int r : reserve) {
            if (lostSet.contains(r)) {
                lostSet.remove(r);
            }else {
                reserveSet.add(r);
            }
        }
//        System.out.println("lost : " + lostSet.toString());
//        System.out.println("reserve : " + reserveSet.toString());

        // 2. 이제 양옆에만 줄 수 있다고 했으니까 비교
        for(int i : reserveSet) {
            if(lostSet.contains(i+1)) {
                lostSet.remove(i+1);
            }else if(lostSet.contains(i-1)){
                lostSet.remove(i-1);
            }
        }

        answer -= lostSet.size();
        System.out.println(answer);
        return answer;
    }
}
