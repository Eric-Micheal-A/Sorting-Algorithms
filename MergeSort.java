import java.util.*;
class Main
  {
    static void merger(int[] a,int strt,int mid,int end)
    {
      int leftsize=mid-strt+1;
      int rightsize=end-mid;
      int leftarray[]=new int[leftsize];
      int rightarray[]=new int[rightsize];
      for(int i=0;i<leftsize;i++)
        leftarray[i]=a[strt+i];
      for(int j=0;j<rightsize;j++)
        rightarray[j]=a[mid+j+1];
      int i=0;
      int j=0;
      int k=strt;
      while(i<leftsize && j<rightsize)
        {
          if(leftarray[i]<=rightarray[j])
          {
            a[k++]=leftarray[i++];
          }
          else
          {
            a[k++]=rightarray[j++];
          } }
      while(i<leftsize)
          a[k++]=leftarray[i++];
      while(j<rightsize)
          a[k++]=rightarray[j++];
    }
   public static void mergesort(int[] a,int strt,int end)
    {
      int mid=strt+(end-strt)/2;
      if(strt<end)
      {
        mergesort(a,strt,mid);
        mergesort(a,mid+1,end);
        merger(a,strt,mid,end);
      }
    }
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int n=d.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=d.nextInt();
      mergesort(a,0,n-1);
      for(int i:a)
        System.out.print(i+" ");
    }
  }  