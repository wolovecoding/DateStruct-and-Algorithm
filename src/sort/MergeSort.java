package sort;

public class MergeSort {

    //fen ge
    void mergeSort(int[] a,int[] tmp,int begin,int end){
        if (begin<end){
            //int center = (end-begin)/2;
            int center = (end+begin)/2;
            mergeSort(a,tmp,begin,center);
            mergeSort(a,tmp,center+1,end);
            merge(a,tmp,begin,center+1,end);
        }

    }
    void merge(int[] a,int[] tmp,int left_beg,int right_beg,int right_end){
        int left_end = right_beg-1;
        int tmpPos = left_beg;
        int elements=right_end-left_beg+1;
        //classic
        while (left_beg<=left_end&&right_beg<=right_end){
            if (a[left_beg]<a[right_beg])
                tmp[tmpPos++]=a[left_beg++];
            else tmp[tmpPos++]=a[right_beg++];
        }
        while (left_beg<=left_end){
            tmp[tmpPos++]=a[left_beg++];
        }
        while (right_beg<=right_end){
            tmp[tmpPos++]=a[right_beg++];
        }

        //copy sorted array
        for (int i=0;i<elements;i++,right_end--){
            a[right_end]=tmp[right_end];
        }
    }
}
