package GraphSearch;

// 재귀함수 연습을 위한 factorial 예제
public class Factorial {
    /**
     * 재귀함수는 반복문을 이용하여 동일한 기능을 구현
     * 컴퓨터가 함수를 연속적으로 호출하면 컴퓨터 메모리 내부의 스택 프레임에 쌓인다
     * : 그래서 스택을 사용해야 할 때 구현상 스택 라이브러리 대신에 재귀함수 이용하는 경우OO
     * */
    public static void main(String[] args) {
        System.out.println("   시작  ");
//        factorial_recursive(5);
        System.out.println(gcd(192, 162));
        System.out.println("    끝   ");
    }

    public static int factorial_recursive(int n) {
        if(n <= 1) return 1;

        int answer = n * factorial_recursive(n -1);
        System.out.println(n + "  :  " + answer);
        return answer;
    }

    // 최대공약수 계산 : 유클리드 호제법
    // 두 자연수 a,b에 대하여 (a>b) a를 b로 나눈 나머지 r
    // a 와b의 최대공약수는 b와 r의 최대공약수와 같다.
    public static int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }else {
            return gcd(b, a%b);
        }
    }
}
