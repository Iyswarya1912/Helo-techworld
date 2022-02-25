package Week1.day1.assignments;

public class Mycalculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int sum=obj.addThreenumbers(1, 2, 3);
		System.out.println("The sum of Three number is: "+sum);

		int sub=obj.subTwonumbers(10,24);
		System.out.println("The subtracion of Two number is: "+sub);
		
		int multiplication=obj.multiply(10,5);
		System.out.println("The multiply of Two number is: "+multiplication);
		
		float division=obj.divide(10,3);
		System.out.println("The division of Two number is: "+division);

	}

}
