public class Pat3
{
 public static void main(String[] args) {
 int i,j,n;
 n=5;
 for(i=1;i<=n;i++)
 {
 for(j=1;j<=i;j++)
 System.out.print("* ");
 System.out.println();
 }
 for(i=n-1;i>0;i--)
 {
 for(j=i-1;j>=0;j--)
 System.out.print("* ");
 System.out.println();
 }
 }
}
