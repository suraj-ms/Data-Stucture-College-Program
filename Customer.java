package college;
import java.util.*;
class Customer{
	public static void main(String args[]) {
		String name;
		System.out.println("Enter info in <name,dd/mm/yyyy>format");
		Scanner scan=new Scanner(System.in);
		name = scan.nextLine();
		StringTokenizer st = new StringTokenizer(name,",/");
		int count = st.countTokens();
		for(int i=0;i<count&&st.hasMoreTokens();i++) {
			System.out.printf(st.nextToken());
		if(i<count) 
			System.out.printf(",");
		}
	}
	
}
