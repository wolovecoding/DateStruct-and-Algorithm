package sort;

public class ShellSort {

    public void shellSort(int[] a){

        for (int gap=a.length/2;gap>0;gap/=2)  //gap间隔  gap的递减规则可以自己指定
            for (int i=gap;i<a.length;++i){
                int tmp = a[i];
                int j;
                for (j=i;j>=gap&&tmp<a[j-gap];j-=gap)
                    a[j]=a[j-gap];
                a[j]=tmp;
            }
    }
}
