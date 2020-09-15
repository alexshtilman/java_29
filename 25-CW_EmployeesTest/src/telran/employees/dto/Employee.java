package telran.employees.dto;

import java.time.LocalDate;

public class Employee {
	private long id;
	private String name;
	private LocalDate birtDay;
	private String department;
	private int salary;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirtDay() {
		return birtDay;
	}

	public String getDepartment() {
		return department;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Emplyee [id=" + id + ", name=" + name + ", birtDay=" + birtDay + ", department=" + department
				+ ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public Long compareTo(Employee empl) {
		Long emplid = empl.getId();
		return this.id - emplid;
	}

	public Employee(long id, String name, LocalDate birtDay, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.birtDay = birtDay;
		this.department = department;
		this.salary = salary;
	}
}
