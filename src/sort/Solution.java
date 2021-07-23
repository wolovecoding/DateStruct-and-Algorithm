package sort;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        quicksort(nums,0,nums.length-1);
        for(int i=0;i<nums.length-2;){
            int j=i+1;int k=nums.length-1;
            while(j<k){
                if(nums[j]+nums[k]+nums[i]<0){++j;}
                else if(nums[j]+nums[k]+nums[i]>0){--k;}
                else{
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);list.add(nums[j]);list.add(nums[k]);
                    lists.add(list);
                    for(++j;nums[j]==nums[j-1];++j);
                    for(--k;nums[k]==nums[k+1];--k);
                    System.out.println(true);
                }
            }
            for (++i;nums[i]==nums[i-1];++i);
        }
        return lists;
    }
    public void quicksort(int[] a,int p,int q){
        if(p<q){
            int i = partition(a,p,q);
            quicksort(a,p,i-1);
            quicksort(a,i+1,q);
        }
    }
    public int partition(int[] a,int p,int q){
        int pivot = a[q];
        int i=p-1;int j=p;
        for(;j<q;j++){
            if(a[j]<pivot){
                i++;
                int tmp = a[j];
                a[j]=a[i];
                a[i]=tmp;
            }
        }
        a[q]=a[i+1];
        a[i+1]= pivot;
        return i+1;
    }
}