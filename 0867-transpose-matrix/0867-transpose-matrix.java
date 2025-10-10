class Solution {
    public int[][] transpose(int[][] matrix) {
        int norows=matrix.length;
        int nocols=matrix[0].length;
        

        int[][] result= new int[nocols][norows];

        for(int row=0;row<norows;row++)
        {
            for (int col=0;col<nocols;col++)
            {
                result[col][row]=matrix[row][col];
            }
        }
        return result; 
    }
}