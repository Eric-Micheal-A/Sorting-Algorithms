import java.util.*;
class Main
  {
    static void Insertion(int[] a,int n)
    {
      int i,j,key;
      for(j=1;j<n;j++)
        {
          key=a[j];
          i=j-1;
          while(i>=0 && a[i]>key)
            {
              a[i+1]=a[i];
              i=i-1
            }
          a[i+1]=key;
        }
      for(i=0;i<n;i++)
        {
          System.out.print(a[i]+" ");
        }
        
    }
    public static void main(String args[])
    {
      Scanner d=new Scanner(System.in);
      int n,i;
      n=d.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
        a[i]=d.nextInt();
      Insertion(a,n);
    }
  }