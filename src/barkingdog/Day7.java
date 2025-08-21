package barkingdog;

/**
 * 덱
 * 양쪽 끝에서 원소 확인, 추가/제거 O(1)
 * deque에서 index를 사용한 임의접근 가능
 */

public class Day7 {

    private final static int MX = 1000005;
    int[] arr = new int[MX*2+1]; // 중간에서부터 배열을 확장하려고
    int head, tail = MX; // deque은 양쪽으로 확장해야 하기 때문에

    void push_front(int x) {
        arr[--head] = x;
    }

    void push_back(int x) {
        arr[tail++] = x;
    }

    void pop_front() {
        head++;
    }

    void pop_back() {
        tail--;
    }

    int front() {
        return arr[head];
    }

    int back() {
        return arr[tail-1];
    }

}
