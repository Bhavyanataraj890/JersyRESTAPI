package Org.Bhavya.HRApplication.HRApp.Database;
import java.util.HashMap;
import java.util.Map;

import Org.Bhavya.HRApplication.HRApp.Model.Employee;

public class EmployeeDatabase {
	private static Map<String, Employee> emps = new HashMap<>();

	public static Map<String, Employee> getEmps() {
		return emps;
	}
}
