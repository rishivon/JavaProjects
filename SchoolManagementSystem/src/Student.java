
public class Student {
	
	private int ID;
	private int grade;
	private String name;
	private int feesPaid;
	private int feesTotal;
	
	// ID, grade, and name to create a new student Object
	// Total fees are 30,000, paid fees are 0
	Student(int id, int Grade, String Name) {
		this.ID = id;
		this.grade = Grade;
		this.name = Name;
		this.feesPaid = 0;
		this.feesTotal = 30000;
	}
	
	// Update student grade
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	// Updates fees paid, school receives funds
	public void payFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}
	public int getID() {
		return ID;
	}
	public int getGrade() {
		return grade;
	}
	public String getName() {
		return name;
	}
	public int getFeesPaid() {
		return feesPaid;
	}
	public int getFeesTotal() {
		return feesTotal;
	}
	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}
	
	public String toString() {
		return "Students name: " + name + "\nTotal fees paid so far: $" + feesPaid;
	}
}
