package Array;

public class mediam {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a =new int[nums1.length+nums2.length]; int k=0;int i,j;
        for(i=0,j=0;i<nums1.length&&j<nums2.length;){
            if(nums1[i]<nums2[j]){a[k]=nums1[i];i++;k++;}
            else{a[k]=nums2[j];j++;k++;}
        }
        if(i==nums1.length){
            for(;j<nums2.length;j++){
                a[k]=nums2[j];k++;
            }
        }else if(j==nums2.length){
            for(;i<nums1.length;i++){
                a[k] = nums1[i];k++;
            }
        }
        if(a.length%2==1||a.length==1)return a[a.length/2];
        else return ( a[a.length/2-1]+a[a.length/2])/2.0;
    }
}
