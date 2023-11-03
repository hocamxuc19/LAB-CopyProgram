public class inmang
{
  /**
 * @param args
 */
public static void main(String[] args) 
  {
    String[] a = {9,5,7,3,11};
    System.out.println(a);
    int i,j;
    System.out.println("Mang a tang dan:");
    for(i=0;i<a.length;i++)
    {
        for(j=i+1;j<a.length;j++)
        {
            if(a[i] > a[j])
            {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            }
        }


    }

    
    


    
  }
}