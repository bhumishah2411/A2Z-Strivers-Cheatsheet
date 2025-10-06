import java.util.Scanner;
public class LargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            int x = sc.nextInt();
            array[i]=x;
        }
        int large = array[0];
        for(int i=1;i<n;i++)
        {
            if(array[i]>large)
            large=array[i];
        }
        System.out.println(large);
    }
}
