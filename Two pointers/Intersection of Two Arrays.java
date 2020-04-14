/*
Problem URL https://leetcode.com/problems/intersection-of-two-arrays/
*/

// find common digits

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> first=new HashSet<>();
        HashSet<Integer> last=new HashSet<>();
        for(int x: nums1){
            first.add(x);
        }
        for(int x: nums2){
            if(first.contains(x)){
                last.add(x);
            }
        }
        int index=0;
        int a[]=new int[last.size()];
        for(int x: last){
            a[index++]=x;
        }
        return a;
    }
}
