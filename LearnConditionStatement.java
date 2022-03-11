package Week1.day2.assignments;

public class LearnConditionStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 34;
		
		if(age<18) {
			System.out.println("Kids");
		}
		else if(age>18 && age<=60)
		{
			System.out.println("Adult");
		}
		if(age>60)
		{
			System.out.println("Senior Citizen");
		}

}
}
