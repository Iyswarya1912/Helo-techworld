package Week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int j = 0;
		int k = 1;
		for(int i = 1;i<=n;++i)
		{
			System.out.println(j + "");
			int Sum = j+k;
			j=k;
			k=Sum;
			}
	} 

}
