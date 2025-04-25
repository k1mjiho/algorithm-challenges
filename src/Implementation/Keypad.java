package Implementation;

import java.util.*;

public class Keypad {
    public static void main(String[] args) {
        solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left");
        // LRLLLRLLRRL
    }

    public static String solution(int[] numbers, String hand) {
        String answer = "";
        Set<Integer> leftArr = new HashSet<>(Arrays.asList(1,4,7));
        Set<Integer> rightArr = new HashSet<>(Arrays.asList(3,6,9));
        int left = 10, right = 12;
        // 이렇게 하는거 맨해튼 거리 계산 법..
        Map<Integer, int[]> pos = new HashMap<>();
        pos.put(1, new int[]{0, 0});
        pos.put(2, new int[]{0, 1});
        pos.put(3, new int[]{0, 2});
        pos.put(4, new int[]{1, 0});
        pos.put(5, new int[]{1, 1});
        pos.put(6, new int[]{1, 2});
        pos.put(7, new int[]{2, 0});
        pos.put(8, new int[]{2, 1});
        pos.put(9, new int[]{2, 2});
        pos.put(10, new int[]{3, 0}); // *
        pos.put(11, new int[]{3, 1}); // 0
        pos.put(12, new int[]{3, 2}); // #

        // 로직
        for(int number : numbers) {
            if(leftArr.contains(number)) {
                left = number;
                answer += "L";
            }else if(rightArr.contains(number)) {
                right = number;
                answer += "R";
            }else{
                if(number == 0) number = 11;
                // 2, 5, 8, 0 : L 이 가까운지 R 이 가까운지 생각
                int[] leftPos = pos.get(left);
                int[] rightPos = pos.get(right);
                int[] numPos = pos.get(number);

                int left_dis = Math.abs(leftPos[0] - numPos[0]) + Math.abs(leftPos[1] - numPos[1]);
                int right_dis = Math.abs(rightPos[0] - numPos[0]) + Math.abs(rightPos[1] - numPos[1]);
                // 만약 거리가 같다면? hand 보고 결정
                if(right_dis == left_dis) {
                    if(hand.equals("right")) {
                        right = number;
                        answer += "R";
                    }else {
                        left = number;
                        answer += "L";
                    }
                }else if (right_dis < left_dis) {
                    right = number;
                    answer += "R";
                }else {
                    left = number;
                    answer += "L";
                }
            }
        }
        return answer;

    }
}
