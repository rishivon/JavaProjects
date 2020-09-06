import java.util.List;

public class School {
	// Many teachers and students in school, use arraylist
	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		this.totalMoneyEarned = 0;
		this.totalMoneySpent = 0;
	}
	
	// returns list of teachers in the school
	public List<Teacher> getTeachers() {
		return teachers;
	}
	
	// adds a teacher to the school
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	
	// returns list of students in the school
	public List<Student> getStudents() {
		return students;
	}
	
	// adds a student to the school
	public void addStudents(Student student) {
		students.add(student);
	}
	
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}
	
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	// update money spent by school which is the salary of the teachers
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned -= moneySpent;
	}
		
}
