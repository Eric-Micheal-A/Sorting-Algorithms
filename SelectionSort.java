import java.util.*;

class Main
  {
    static void selection(int a[],int n)
    {
      int min;
      for(int i=0;i<n;i++)
        {
          min=i;
          for(int j=i+1;j<n;j++)
            {
              if(a[j]>a[min])
              {
                min=j;
              }
              int t;
              t=a[min];
              a[min]=a[j];
              a[j]=t;
            }
        }
    }
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int n=d.nextInt();
      int a[]=new int[n];
      for(int i=0; i<n; i++)
        a[i]=d.nextInt();
      selection(a,n);
      for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
  }