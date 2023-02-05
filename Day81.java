Q.Given a binary tree. The task is to find the maximum GCD of the siblings of this tree. You have to return the value of the node whose two immediate children has the maximum gcd.
If there are multiple such nodes, return the node which has the maximum value.
Siblings: Nodes with the same parent are called siblings.
GCD (Greatest Common Divisor) of two positive integers is the largest positive integer that divides both numbers without a remainder.
Note:
Consider those nodes which have a sibling.
Return 0 if no such pair of siblings found.
  Your Task:
You don't need to take input. Just complete the function maxGCD() that takes the root node as a parameter and returns the value of the node whose two immediate children has 
the maximum gcd.
class Solution {
    int max_gcd;
    int ans;
    int maxGCD(Node root) {
        // code here 
        ans=0;
        max_gcd=0;
        dfs(root);
        return ans;
    }
    int dfs(Node root){
        if(root==null)return 0;
        int left=dfs(root.left);
        int right=dfs(root.right);
         if(left!=0 && right!=0){
            int gcd=gcd(left,right);
            if (gcd>max_gcd){
                max_gcd=gcd;
                ans=root.data;
            }else if(gcd==max_gcd && root.data>ans){
                ans=root.data;
            }
            
        }
        return root.data;
    }
    int gcd(int a, int b){
        if(a==0)return b;
        return gcd(b%a,a);
    }
}
