class Solution {
    public int fib(int n) {
        int first = 0;
        int second = 1;
        int third = 0;
          for(int i=0 ; i<n ; i++)
          {
            first = second;
            second = third;
            third = first+second;
          }
           return third;
        
    }
}