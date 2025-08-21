package barkingdog;

/**
 * 스택 (FILO)
 * 제일 상단의 원소 확인, 원소 추가/제거 O(1)
 * 배열 || 연결리스트로 구현 가능 >> 배열이 더 쉬움
 * 스택이 비어있을때 top, pop 실행하지 않았는지 확인
 */

public class Day5 {

    private final static int MX = Integer.MAX_VALUE;
    int[] arr = new int[MX];
    int pos = 0;

    public static void main(String[] args) {

    }

    void push(int x) {
        arr[pos] = x;
        pos++;
    }

    void pop() {
//        arr[pos] = 0; // 어차피 나중에 덮어씌워질테니 굳이 안지워도 됨
        pos--;
    }

    int top() {
        return arr[pos-1];
    }
}
