class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false; // This handles negative numbers as they can't be palindrome
        int initial = x;
        long rev = 0 ;
        while (x !=0) {
            rev = (rev*10) + x %10;
            x =x/10;
        }
        if (rev == initial) {
            return true;
        }
        return false;
    }
}
