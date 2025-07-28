package barkingdog;

import java.util.Arrays;
/*
* Day3 배열
* 원소가 연속적으로 저장되어있음
* */
public class day3 {

    public static void main(String[] args) {

        int[] arr = {10, 50, 40, 30, 70, 20};
        int len = 6;
        arr = insert(3, 60, arr, len); // {10, 50, 40, 60, 30, 70, 20}
        System.out.println(Arrays.toString(erase(4, arr, arr.length)));
    }

    public static int[] insert(int idx, int num, int arr[], int len) {
        int[] answer = new int[len+1];
        /* 임시배열을 쓰지 않고 푸는 방법도 있다..! 대박
        바로 오른쪽부터 옮기느것임.. for(int i=len; i<len; i--)
         */
        for(int i=0; i<len+1; i++) {
            if(i<idx) {
                answer[i] = arr[i];
            }else if(i==idx) {
                answer[i] = num;
            }else {
                answer[i] = arr[i-1];
            }
        }

        return answer;
    }

    public static int[] erase(int idx, int arr[], int len) {
        int[] answer = new int[len-1];

        for(int i=0, j=0; i<len; i++) {
            if(i == idx) continue;
            answer[j++] = arr[i];
        }
//
//        for(int i=0; i<len; i++) {
//            if(i < idx) {
//                answer[i] = arr[i];
//            }else if(i == idx){
//                continue;
//            }else {
//                answer[i-1] = arr[i];
//            }
//        }

        return answer;
    }
}
