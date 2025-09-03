class Solution {
    public boolean isPalindrome(int x) {
    //    if(x<0) return false ;
        int digit;
        int tani=x;
        int rev=0;
        x=Math.abs(x);
        while (tani!=0)
        {
            digit = tani %10;
            rev = (rev * 10) + digit ;
            tani= tani/10 ;
        }
        
        return rev==x;
    }
}