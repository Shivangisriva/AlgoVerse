class Solution {
    int dp[];
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int n = arr.length;
        dp =new int[n+1];
    for(int i = n-1 ; i>=0 ; i--)
    {
           int len=0;
        int sum = 0;
        int maxval = 0;
        int maxsum = 0;
        for(int ind =i ; ind< Math.min(arr.length , i+k) ; ind++)
        {
         len++;
         maxval = Math.max(maxval , arr[ind]);
         sum =(len*maxval) + dp[ind+1];
         maxsum = Math.max(sum , maxsum);
        }
        dp[i] =maxsum;
    }
        return dp[0];
    }
}
