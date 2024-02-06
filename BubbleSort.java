import java.util.*;
class Main  
  {
    static void bubble(int[] a,int n)
    {
      int j,i;
      for(i=0;i<n-1;i++)
        {
          for(j=0;j<n-i-1;j++)
            {
              if(a[j]>a[j+1])
              {
                int t;
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
              }
            }
        }
      for(i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int n,i;
      n=d.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
        a[i]=d.nextInt();
      bubble(a,n);
    }
  }