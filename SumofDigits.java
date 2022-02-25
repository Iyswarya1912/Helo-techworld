package Week1.day1.assignments;

public class SumofDigits {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		int a = 234;
		int sum=0, reminder =0;
		while(a!=0) {
			reminder = a%10;
			//System.out.println("first sum"+sum);
			sum=sum+reminder;
			//System.out.println(sum);
			a=a/10;
			//System.out.println(a);
		
		}
		System.out.println("sum of digits:" +sum);
	}

}
