package session11_DesignPattern.DAO;

public class MainClaz {
	public static void main(String[] args) {
		EmployeeJDBCDAO student = new EmployeeJDBCDAO();
		EmployeeBean alok = new EmployeeBean();
		alok.setName("abc123");
		alok.setEmpId(9);
		alok.setEmpAddress("Ranchi");
		EmployeeBean tinkoo = new EmployeeBean();
		tinkoo.setName("Arvind");
		tinkoo.setEmpId(6);
                tinkoo.setEmpAddress("Japan");
		// Adding Data
		student.add(alok);
		// Deleting Data
		//student.delete(8);
		// Updating Data
		//student.update(tinkoo);
		// Displaying Data
		student.findAll();
	}
}
