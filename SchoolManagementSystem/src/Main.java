import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Teacher bob = new Teacher(1, "Bob", 500);
		Teacher Shaniqua = new Teacher(2, "Shaniqua", 1000);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(bob);
		teacherList.add(Shaniqua);
		
		// new students (id, grade, name)
		Student Rishi = new Student(40, 12, "Rishi");
		Student Lashoon = new Student(41, 11, "Lashoon");
		List<Student> studentList = new ArrayList<>();
		studentList.add(Rishi);
		studentList.add(Lashoon);
		
		School Yale = new School(teacherList, studentList);
		Rishi.payFees(5000);
		System.out.println("Rishi has paid " + Rishi.getFeesPaid() + ". He has " + Rishi.getRemainingFees() + " left to pay.");
		System.out.println("Yale has earned " + Yale.getTotalMoneyEarned());
		
		System.out.println("-----SCHOOL PAYING TEACHERS-----");
	    bob.receiveSalary(bob.getSalary());
	    System.out.println("Yale has paid salary to " + bob.getName() + " and now has " + Yale.getTotalMoneyEarned());
	    
	    System.out.println(Rishi);
	    System.out.println(Shaniqua);
	}

}
