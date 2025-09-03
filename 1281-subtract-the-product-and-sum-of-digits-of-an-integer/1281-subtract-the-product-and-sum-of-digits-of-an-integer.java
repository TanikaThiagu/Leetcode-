class Solution {
    public int subtractProductAndSum(int n) {
      int digit  ,mul=1,add=0 , res = 0 ;
      while (n!=0)
      {
        digit = n%10 ;
        n = n/10 ;
        mul = mul*digit;
        add = add+digit;
        res = mul-add;
      }
      return res;  
    }
}