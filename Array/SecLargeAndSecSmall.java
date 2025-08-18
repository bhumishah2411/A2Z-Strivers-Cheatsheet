import java.util.Scanner;

public class SecLargeAndSecSmall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            int x = sc.nextInt();
            array[i]=x;
        }
        int small = Integer.MAX_VALUE, secSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE, secLarge = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(array[i]<small)
            small=array[i];
            if(array[i]>large)
            large=array[i];
        }
        for(int i=0;i<n;i++)
        {
            if(array[i]<secSmall && array[i]!=small)
            secSmall=array[i];
            if(array[i]>secLarge && array[i]!=large)
            secLarge=array[i];
        }
        System.out.println("Second Largest : "+secLarge);
        System.out.println("Second Smallest : "+secSmall);
    }
}
