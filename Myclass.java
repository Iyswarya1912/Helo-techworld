package Week1.day2.assignments;

import Week1.day1.assignments.ClassForExecution;
import Week1.day1.assignments.LearnMethods;

// want to use class from different package you have to import the package
//syntax : packagename.className

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnMethods object1 = new LearnMethods();
		ClassForExecution cfe = new ClassForExecution();
		
		object1.printName();
		cfe.sample();

	}
}
