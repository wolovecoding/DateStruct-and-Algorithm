package sort;

public class CountSort {
    void countSort(int[] a,int[] b){
        int[] tmp = new int[10];

        //save count of every number in 0~9 into tmpArray[number]
        for (int i=0;i<a.length;i++){
            tmp[a[i]] = tmp[a[i]]+1;
        }
        // figure out the position of the number
        //for (int i=1;i<a.length;++i){
        for (int i=1;i<tmp.length;++i){
            tmp[i] += tmp[i-1];
        }
        // sorted array into bArray
        for (int i=0;i<a.length;i++){
            b[tmp[a[i]]-1] = a[i];   //because array begin 0;but if have a number,count = 1 ;
            tmp[a[i]]--;
        }
    }
}
