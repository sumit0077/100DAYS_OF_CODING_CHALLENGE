An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return true if n is an ugly number.

 
class Solution {
private:
    int keepsOndividingUntilPossible(int dividend, int divisor){
        while(dividend % divisor == 0){
            dividend /= divisor;
        }
        return dividend;
    }
public:
    bool isUgly(int n) {
        if(n<=0) return false;
        for(auto factor : {2,3,5}){
            n = keepsOndividingUntilPossible(n, factor);
        }
        return n == 1;
    }
};
