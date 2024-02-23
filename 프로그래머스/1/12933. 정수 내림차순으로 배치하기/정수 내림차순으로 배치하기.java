import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = n + "";
        long[] arr = new long[str.length()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = n%10;
            n /= 10;
        }
        
        Arrays.sort(arr);
        
        int cnt = 1;
        for(int i = 0; i < arr.length; i++){
            answer += arr[i] * cnt;
            cnt *= 10;
        }
            
        return answer;
    }
}