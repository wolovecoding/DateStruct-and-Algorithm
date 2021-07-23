package sort;

public class QuickSort {
    void quicksort(int[] a,int p,int r){
        if (p<r){
            int q = partition(a,p,r);
            quicksort(a,p,q-1);
            quicksort(a,q+1,r);
        }
    }
    int partition(int[] a,int p,int r){
        int x = a[r];   //pivot
        int i = p-1;int j = p; //at beginning i = p-1  can avoid the first loop
        for (;j<r;++j){
            if (a[j]<x){
                i++;
             /*   a[j]=a[i]^a[j];
                a[i]=a[j]^a[i];
                a[j]=a[i]^a[j];
                这里不用异或，因为指的可能是同一个数。  eg:i=j=4
                */
                int tmp = a[j];
                a[j]=a[i];
                a[i]=tmp;
            }
        }
        a[r] = a[i+1];
        a[i+1] = x;
        return i+1;
    }
}
