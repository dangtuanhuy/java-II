package session11_DesignPattern.DAO;

import java.io.Serializable;

public class EmployeeBean implements Serializable {
	int empId;
	String empName;
	String empAddress;

	public EmployeeBean() {

	}

	public EmployeeBean(int roll, String name, String course) {
		this.empId = roll;
		this.empName = name;
		this.empAddress = course;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int rollNo) {
		this.empId = rollNo;
	}

	public String getName() {
		return empName;
	}

	public void setName(String name) {
		this.empName = name;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String course) {
		this.empAddress = course;
	}

}
