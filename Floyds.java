package college;
import java.util.Scanner;
public class Floydclass {
	static final int max=20;
	static int a[][];
	static int n;
	public static void main(String args[]) {
		a = new int[max][max];
		Readmatrix();
		Floyds();
		Display();
	}
	 static void Readmatrix() {
		System.out.println("Enter number of matrix");
		Scanner scan = new Scanner(System.in);
		 n = scan.nextInt();
		System.out.println("Enter matrix");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				a[i][j]= scan.nextInt();
		
	}}
	 scan.close();
}

	 static void Floyds() {
		 
	 for(int k=1;k<=n;k++) {
		 for(int i=1;i<=n;i++) 
				for(int j=1;j<=n;j++) 
				if((a[i][k]+a[k][j])<a[i][j]) 
					a[i][j]=a[i][k]+a[k][j];
				
				
	 }
	 }
	 static void Display() {
			System.out.println("MATRIX IS");
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) 
					System.out.printf(a[i][j]+"\t");
				System.out.printf("\n");
				
					
			}
	 }
	 }

