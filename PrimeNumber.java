package Week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		boolean flag = true;
		for(int i=2; i<n;i++)
		{
			if(n%i==0) {
				flag= false;
				}
		}
			if(flag) {
				System.out.println("it is a prime number");
			}
			else {
				System.out.println("it is not a prime number");
			}
		}
		
	
}
