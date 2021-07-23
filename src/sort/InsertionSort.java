package sort;

public class InsertionSort {
    public void insert(int[] a){
        int len = a.length; // Java中数组长度
        int p;int tmp;
        for (p=1;p<len;p++){
            tmp=a[p];
         /*   for (;j>0&&a[j]<a[j-1];--j)
            a[j]=a[j]^(a[j]^a[j-1]);
            a[j-1]=a[j]^(a[j]^a[j-1]);
            想法不是最简单的，书上是，前面的每一个元素和a[p]比较。而我多了一步，把不必要的赋值附上了。
            */
            int j;
            for (j=p;j>0&&tmp<a[j-1];j--)
                a[j]=a[j-1];
            a[j]=tmp;
        }
    }
}
