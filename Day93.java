Given a positive integer num, return true if num is a perfect square or false otherwise.
A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
You must not use any built-in library function, such as sqrt.
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num ==1) return true;
//long is used as mid*mid will go above the limit of int
        long i=2;
        long l = num/2;
        while(i<=l){
            long mid =i +(l-i)/2;

            if(mid*mid == num){
                return true;
            }
            else if(mid*mid<num){
                i= mid+1;
            }
            else{
                l = mid-1;
            }

        }

        return false;
    }
}
