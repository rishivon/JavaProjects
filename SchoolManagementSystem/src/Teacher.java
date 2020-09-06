
public class Teacher {
	private int ID;
	private String name;
	private int salary;
	private int salaryEarned;
	
	Teacher(int id, String name, int salary) {
		this.ID = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
	}
	// Setter method because salary is variable to change
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary; 
	}
	
	public void receiveSalary(int salary) {
		salaryEarned += salary;
		School.updateTotalMoneySpent(salary);
	}
	
	public String toString() {
		return "Teachers name: " + name + "\nSalary earned $" + salaryEarned;
	}
}
