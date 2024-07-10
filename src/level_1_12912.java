//두 정수 사이의 합
//두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution 을 완성하세요.
//예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

public class level_1_12912 {
    public long solution (int a, int b) {
        long sum = 0;

        //a와 b의 대소 관계를 파악하여 작은 값을 start 에, 큰 값을 end 에 저장합니다.
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        //start 부터 end 까지 모든 정수를 더합니다.
        for (int i = start; i <= end; i++) {
            sum += i;
        }

        return sum;
    }
}
