class Solution {
    public int solution(int[] nums) {
        int answer = -1;
        int sum = 0;

        int tmp = 0;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println("Hello Java");
        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i+1; j < nums.length - 1; j++) {
                for(int k = j+1; k < nums.length ; k++) {
                    sum = nums[i]+nums[j]+nums[k];
                    
                    
                    if(isPrime(sum)) {
                        tmp++;
                    }
                }
            }
        }
        return tmp;
 
}
    private static boolean isPrime (int n) {
    if (n < 2) {
        return false;
    }
    for (int i = 2; i < n; i++) {
        if((n % i) == 0) {
            return false;
            }
       
        }
        return true;
    }       
}
