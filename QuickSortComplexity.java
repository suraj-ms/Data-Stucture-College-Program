package college;
import java.util.*;
import java.util.Random;
import java.util.Arrays;
public class QuicSortComplexity{
	static final int MAX=10005;
	static int[] a = new int[MAX];
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter max array size");
		int n = scan.nextInt();
		Random random = new Random();
		
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
			a[i]=random.nextInt(1000);
			System.out.println("Input arraye");
			for(int i=0;i<n;i++)
			System.out.println(a[i]+"");
		long startTime=System.nanoTime();
		QuicSortAlgorithm(0,n-1);
		long stopTime=System.nanoTime();
		long elapsedTime=stopTime-startTime;
		System.out.println("sorted elements are:");
		for(int i=0;i<n;i++)
			System.out.println(a[i]+"");
		System.out.println("Time complexityin in ms for n"+n+"is:"+(double)elapsedTime/1000000);
		
	}


public static void QuicSortAlgorithm(int p,int r) {
int i,j,temp,pivot;
if(p<r) {
	i=p;
	j=r+1;
	pivot=a[p];
	while(true) {
		i++;
	while(a[i]<pivot && i<j)
		i++;
	j--;
	while(a[j]>pivot)
		j--;
	if(i<j) {
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}else
		break;
	}
	a[p]=a[j];
	a[j]=pivot;
	QuicSortAlgorithm(p,j-1);
	QuicSortAlgorithm(j+1,r);
}
}
}
