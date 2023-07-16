import java.util.Scanner;
public class FindBiggestElementInArray {
	public static void main(check[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements you have?");
		int n=sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter "+n+" elements one by one");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Entered array is:");
		dispArr(ar);
		int big=findBig(ar);
		System.out.println("Biggest element in the given array is "+big);
	}
	public static void dispArr(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(i<a.length-1)
				System.out.print(a[i]+", ");
			else
				System.out.println(a[i]);
		}
	}
	public static int findBig(int[] a)
	{
		int big=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>big)
				big=a[i];
		}
		return big;
	}

}
