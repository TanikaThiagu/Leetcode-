class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=accounts.length;
        int n=accounts[0].length;
        int max=0,sum;

        for(int row=0; row<m;row++)
        {
            sum=0;
            for(int col=0; col<n;col++)
            {
                sum=sum+accounts [row][col];

            }
            if(sum>max)
             max=sum;
        }
        return max;
    }
}