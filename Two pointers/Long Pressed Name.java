/*
Problem URL https://leetcode.com/problems/long-pressed-name/
*/

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if((name.length()==typed.length()) && name.equals(typed)){
            return true;
        }
        int l=0,r=0;
        while(r<typed.length()){
            if(l<name.length() && name.charAt(l)==typed.charAt(r)){
                l++;
            }
            else if(r==0 || typed.charAt(r)!=typed.charAt(r-1)){
                return false;
            }
            r++;
        }
        
        return l==name.length();
    }
}
