class Solution(object):
    def divide(self, dividend, divisor):
        # Edge case: overflow
        if dividend == -2**31 and divisor == -1:
            return 2**31 - 1
        
        # Determine sign
        negative = (dividend < 0) != (divisor < 0)
        
        # Work with positives
        dividend, divisor = abs(dividend), abs(divisor)
        
        quotient = 0
        
        while dividend >= divisor:
            temp = divisor
            multiple = 1
            
            # Find largest shift
            while dividend >= (temp << 1):
                temp <<= 1
                multiple <<= 1
            
            dividend -= temp
            quotient += multiple
        
        return -quotient if negative else quotient