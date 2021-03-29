package task8;

class Employee extends Human implements Comparable<Employee> {
	protected double Salary;

	public Employee(String Name, String Surname, double Salary) {
		super(Name, Surname);
		this.Salary = Salary;
	}

	public Employee(Employee E) {
		super(E);
		this.Salary = E.Salary;
	}

	final public double getSalary() {
		return Salary;
	}

	final public void setSalary(double Salary) {
		this.Salary = Salary;
	}

	@Override
	public String toString() {
		return super.toString() + ".   Salary: " + Salary + " EUR.";
	}

	@Override
	public int compareTo(Employee emp1) {
		return (int) (this.Salary - emp1.getSalary());
	}
}
