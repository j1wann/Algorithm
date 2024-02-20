class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int cnt = 0;
        for(int i : numlist){
            if(i % n ==0)
                cnt++;
        }
        answer = new int[cnt];
        int i = 0;
        for(int num : numlist){
            
            if(num % n ==0){
                answer[i] = num;
                i++;
            }
        }
        return answer;
    }
}