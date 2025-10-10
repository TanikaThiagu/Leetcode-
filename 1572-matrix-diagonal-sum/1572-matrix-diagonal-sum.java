class Solution {
    public int diagonalSum(int[][] mat) {
        int size=mat.length;
        int sum=0;
        {
            for (int row=0;row<size;row++)
            for(int col=0;col<size;col++){
                if(row==col)
                 sum=sum+mat[row][col];
                else if(row+col == size-1)
                 sum=sum+mat[row][col];
        

            }
        }
        return sum;
    }
}