import java.util.Scanner;
interface operation{
	int calculate(int a , int b);
}
class add implements operation{
	int a,b;
	
	add(int a, int b){
		this.a=a;
		this.b=b;
	}
	public int calculate(int a , int b){
		int result=a+b;
		return result;
	}
}
class subtract implements operation{
	int a,b;
	
	subtract(int a, int b){
		this.a=a;
		this.b=b;
	}

	public int calculate(int a , int b){
		int result=a-b;
		return result;
	}
}

class Main{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int a= sc.nextInt();
		System.out.print("Enter 2nd number:");
		int b= sc.nextInt();
		operation a1= new add(a,b);
		int sum=a1.calculate(a,b);
		System.out.print("Addition Result: "+sum);
		operation a2= new subtract(a,b);
		int sub=a2.calculate(a,b);
		System.out.println("\nSubtraction Result: "+sub);


	}
}