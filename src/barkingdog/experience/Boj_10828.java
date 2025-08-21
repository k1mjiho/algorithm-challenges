package barkingdog.experience;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_10828 {

        public static int[] stack;
        public static int size = 0;

        public static void main(String[] args) throws IOException {
                // 입력
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringBuilder sb = new StringBuilder();

                // 백준 문제는 입력을 띄어쓰기로 구분하는 경우가 있기 때문에 StringTokenizer 사용
                StringTokenizer st;
                int N = Integer.parseInt(br.readLine());

                stack = new int[N];
                // 로직
                while (N-- > 0) {
                        st = new StringTokenizer(br.readLine(), " ");

                        switch (st.nextToken()) {
                                case "push":
                                        push(Integer.parseInt(st.nextToken()));
                                        break;
                                case "pop":
                                        sb.append(pop()).append('\n');
                                        break;
                                case "size":
                                        sb.append(size()).append('\n');
                                        break;
                                case "empty":
                                        sb.append(empty()).append('\n');
                                        break;
                                case "top":
                                        sb.append(top()).append('\n');
                                        break;

                        }
                }

                // 출력
                System.out.println(sb);
//                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//                bw.write(String.valueOf("")); // 버퍼에 넣을 내용
//                bw.flush(); // 내용 출력
//                bw.close(); // 종료
        }

        public static void push(int x) {
                stack[size] = x;
                size++;
        }

        public static int size() {
                return size;
        }

        public static int pop() {
                if(size == 0) {
                        return -1;
                }else {
                        int tmp = stack[size-1];
                        stack[size-1] = 0;
                        size--;
                        return tmp;
                }
        }

        public static int top() {
                if(size == 0) {
                        return -1;
                }else {
                        return stack[size--];
                }
        }

        public static int empty() {
                if(size == 0) {
                        return 1;
                }else {
                        return 0;
                }
        }
}
