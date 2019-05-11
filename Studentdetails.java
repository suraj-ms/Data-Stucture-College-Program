package college;
import java.util.Scanner;
class Student {
	String  USN,Name,Branch,Phone;
	Scanner input = new Scanner(System.in);
	void read() {
		System.out.println("Enter student details");
		System.out.println("Enter USN:");
		USN=input.nextLine();
		System.out.println("Enter Name:");
		Name=input.nextLine();
		System.out.println("Enter Branch:");
		Branch=input.nextLine();
		System.out.println("Enter Phone:");
		Phone=input.nextLine();
	}
	void display() {
		System.out.printf("%-20s %-20s %-20s %-20s",USN,Name,Branch,Phone);	
	}
}
public class Studentdetails {
	public static void main(String args[]) {
Scanner input = new Scanner(System.in);

System.out.println("Enter number of students details:");
int number = input.nextInt();
Student s[] = new Student[number];
for(int i=0;i<number;i++) {
	s[i]=new Student();
    s[i].read();
}
System.out.printf("%-20s %-20s %-20s %-20s","USN","Name","Branch","Phone");
for(int i=0;i<number;i++) {
	System.out.println();
	s[i].display();
}
input.close();
}
}
