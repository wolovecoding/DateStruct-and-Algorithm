package sort;

public class HeapSort {

    //
    public int leftChild(int i){
        return 2*i+1;
    }

    /**
     *move element to propel place
     * @param a  array
     * @param i  element position
     * @param n  array.length
     */
    public void percDown(int[] a,int i,int n){
        int child;
        int tmp;
        for (tmp=a[i];leftChild(i)<n;i=child){
            child = leftChild(i);
            if (child<n-1&&a[child]<a[child+1])
                child++;  //now child is right child
            if (tmp<a[child])
                a[i]=a[child];
            else break;
        }
        a[i]=tmp;
    }
    void swapReferences(int[] a,int b,int c){
        a[b]=a[c]^a[b];
        a[c]=a[b]^a[c];
        a[b]=a[b]^a[c];
    }
    void heapsort(int[] a){
        // build binary heap
        for (int i=a.length/2-1;i>=0;i--){
            percDown(a,i,a.length);
        }

        //deleteMax
        for (int i=a.length-1;i>0;i--){
                swapReferences(a,0,i);/*deleteMax --- actually swap max and a[i]*/
                percDown(a,0,i);    /*now a[0] is value that was a[i] before. then percDown it*/
        }

    }

}
