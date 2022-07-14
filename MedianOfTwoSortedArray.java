class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int l=(m+n+1)/2;
        int r=(m+n+2)/2;
        return (calKth(nums1, 0, nums2, 0, l) + calKth(nums1, 0, nums2, 0, r))/2.0;
    }
    
    public double calKth(int[] nums1, int st1, int[] nums2, int st2, int k){
        if(st1>nums1.length-1){
            return nums2[st2 + k -1];
            
        }
        if(st2>nums2.length - 1){
            return nums1[st1 + k -1];
        }
        if(k==1){
            return Math.min(nums1[st1], nums2[st2]);
        }
        
        int nums1mid=Integer.MAX_VALUE;
        int nums2mid=Integer.MAX_VALUE;
        if(st1 +k/2-1<nums1.length){
            nums1mid=nums1[st1 + k/2 -1];
        }
        if(st2 + k/2 -1<nums2.length){
            nums2mid=nums2[st2 + k/2 -1];
        }
        if(nums1mid<nums2mid){
            return calKth(nums1, st1+k/2, nums2, st2, k-k/2);
        }
        else{
            return calKth(nums1, st1, nums2, st2+k/2, k-k/2);
        }
    }
}
