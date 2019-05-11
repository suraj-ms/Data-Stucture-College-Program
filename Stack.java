package college;
import java.util.Scanner;
class ArrayStack{
	int arr[];
	int top,max;
	ArrayStack(int n){
		max=n;
		arr= new int[max];
		top=-1;
	}
	void push(int i) {
		if(top==max-1)
		{
System.out.println("Stack overflow");

		}else {
		arr[++top]=i;
	}}

void pop() {
	if(top==-1)
	{
System.out.println("Stack underflow");

	}else {
	int element=arr[top--];
	System.out.println("deleted element is"+element);
}}
void display() {
	if(top==-1)
	{
System.out.println("Stack underflow");
	return;
	}
	for(int i=top;i>=0;i--) {
		System.out.println(arr[i]+"");
	
}}
}
public class Stack {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of the stack");
		int n = scan.nextInt();
		boolean done=false;
		ArrayStack stk = new ArrayStack(n);
		do {
			System.out.println("select one");
			System.out.println("1.push \t 2.pop \t 3.display \t 4.Exit");
		
			int choice = scan.nextInt();
			switch(choice){
				case 1: System.out.println("Enter element");
						stk.push(scan.nextInt());
						break;
				case 2:stk.pop();
				        break;
				case 3:stk.display();
		        		break;
				case 4:done=true;
		        		break;
		        default:System.out.println("Error");
		        		break;
		        		
			}
			
		}
		while(!done);
	}
}
