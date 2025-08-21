package barkingdog;

/**
 * 큐 (FIFO)
 * 제일 앞/뒤 원소 확인, 원소 추가/제거 O(1)
 * 선형 배열에서 낭비하는 메모리를 해결하기 위해 원형 큐 사용
 * 근데 코테에서는 굳이 그렇게까지 안나옴
 */

public class Day6 {
    private final static int MX = Integer.MAX_VALUE;
    int[] arr = new int[MX];
    int head, tail = 0;

    public static void main(String[] args) {

    }

    public void push(int x) {
        arr[tail] = x;
        tail++;
    }

    public void pop() {
        head++;
    }

    public int front() {
        return arr[head];
    }

    public int back() {
        return arr[tail-1];
    }

}
