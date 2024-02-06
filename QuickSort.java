import java.util.*;
class Main
  {
    static int partition(int a[],int strt,int end)
    {
      int pivot=a[end];
      int p=-1;
      for(int i=0;i<end;i++)
        {
          if(a[i]<pivot)
          {
            ++p;
            int t;
            t=a[i];
            a[i]=a[p];
            a[p]=t;
          }
        }
      ++p;
      int t1;
      t1=a[end];
      a[end]=a[p];
      a[p]=t1;
      return p;
    }
    static void quicksort(int a[],int strt,int end)
    {
      if(strt<end)
      {
        int pi=partition(a,strt,end);
        quicksort(a,strt,pi-1);
        quicksort(a,pi+1,end);
      }
    }
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int n=d.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=d.nextInt();
      quicksort(a,0,n-1);
      for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
  }