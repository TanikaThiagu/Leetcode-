class Solution {
    public int countDigits(int num) {
       int count=0 ;int backup=num;int digit;
       while(num!=0){

         digit =num%10;
         if(backup % digit ==0)
         count++;
         num=num/10;
       }
       return count;

    }
}