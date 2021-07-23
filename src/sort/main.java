package sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class main {
    public static void main(String[] args) {
        int[] a = new int[]{5,8,4,5,9,3,2};
        int[] b = new int[]{-1,0,1,2,-1,-4};
        int[] c = new int[7];
     /*
        InsertionSort sort = new InsertionSort();
        sort.insert(a);
        */

       /*
        ShellSort sort = new ShellSort();
        sort.shellSort(a);
        */
       /*
        HeapSort sort = new HeapSort();
        sort.heapsort(a);*/
      /*
        MergeSort sort = new MergeSort();
        int[] tmp = new int[a.length];
        sort.mergeSort(a,tmp,0,a.length-1);
*//*
        QuickSort sort = new QuickSort();
        sort.quicksort(b,0,b.length-1);*/

        /*  Solution solution = new Solution();
        solution.threeSum(b);*/

        /*BubbleSort sort = new BubbleSort();
        sort.bubbleSort(a);*/

        CountSort sort = new CountSort();
        sort.countSort(a,c);

       //  for (int i=0;i<b.length;i++) System.out.println(b[i]);
       // for (int i=0;i<a.length;++i) System.out.println(a[i]);
        for (int i=0;i<c.length;i++) System.out.println(c[i]);
       // System.out.println(b.length);
    }
}
