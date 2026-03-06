class Solution {
    public int solution(int n) {
        int answer = 0;
        int fiboResult = method1(n);
        
        return fiboResult%1234567;
    }
    
    int method1(int n){
        int[] fiboArray = new int[n+1];
        fiboArray[0] = 0;
        fiboArray[1] = 1;
        
        for(int i = 2; i < n+1; i++){
            fiboArray[i] = (fiboArray[i-1] + fiboArray[i-2])%1234567;
        }
        return fiboArray[n];
    }
    
}