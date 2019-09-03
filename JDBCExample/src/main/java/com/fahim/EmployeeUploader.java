package com.fahim;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeUploader {

	public void storeDepartmentDetails(int dept_id,String dept_name,String dept_head,String dept_description) {
		String dbURL = "jdbc:mysql://localhost:3306/SampleDB";
		String username = "root";
		String password = "root@123";
		try {
			Connection conn = DriverManager.getConnection(dbURL, username, password);
			if (conn != null) {
				Statement stmt = conn.createStatement(); 
				String q1 = "insert into department values('" +dept_id+ "','" +dept_name+ "', '" +dept_head+  
						"', '" +dept_description+ "')"; 
				int x = stmt.executeUpdate(q1); 
				if (x > 0)             
					System.out.println("Successfully Inserted");             
				else            
					System.out.println("Insert Failed"); 
				conn.close(); 
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public void storeEmployeeDetails(int emp_id,String emp_name,String emp_address,double emp_salary,String emp_contact_no,int dept_id) {
		String dbURL = "jdbc:mysql://localhost:3306/SampleDB";
		String username = "root";
		String password = "root@123";
		try {
			Connection conn = DriverManager.getConnection(dbURL, username, password);
			if (conn != null) {
				Statement stmt = conn.createStatement(); 
				String q1 = "insert into employee values('" +emp_id+ "','" +emp_name+ "', '" +emp_address+  
						"', '" +emp_salary+ "', '" +emp_contact_no+ "','" +dept_id+"')"; 
				int x = stmt.executeUpdate(q1); 
				if (x > 0)             
					System.out.println("Successfully Inserted");             
				else            
					System.out.println("Insert Failed"); 
				conn.close(); 
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}


	public void retrieveEmployeeDetails(int emp_id) {
		String dbURL = "jdbc:mysql://localhost:3306/SampleDB";
		String username = "root";
		String password = "root@123";
		try {
			Connection conn = DriverManager.getConnection(dbURL, username, password);
			if (conn != null) {
				Statement stmt = conn.createStatement();
				String q1 = "select employee_id,employee_name,employee_contact_no,employee_address,department_name,department_head from"+
						"	            employee e inner join department d"+
						"	            on e.department_id=d.department_id where e.employee_id="+emp_id;


				ResultSet rs = stmt.executeQuery(q1); 
				if (rs.next()) 
				{ 
					System.out.println("Employee Id : " + rs.getString(1)); 
					System.out.println("Employee Name :" + rs.getString(2)); 
					System.out.println("Employee Contact Number :" + rs.getString(3));
					System.out.println("Employee Address :" + rs.getString(4));
					System.out.println("Department Name :" + rs.getString(5));
					System.out.println("Department Head :" + rs.getString(6));
				} 
				else
				{ 
					System.out.println("Employee Id not Present"); 
				} 
				conn.close(); 
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

	}

	public void calculatePF(int id) {
		String dbURL = "jdbc:mysql://localhost:3306/SampleDB";
		String username = "root";
		String password = "root@123";
		try {
			Connection conn = DriverManager.getConnection(dbURL, username, password);
			if (conn != null) {
				String createSP = "CREATE PROCEDURE get_employee_by_id(emp_id employee.employee_id%type, OUT pfAmount number)\r\n" + 
						"salary employee.employee_salary%type;\r\n" + 
						"BEGIN\r\n" + 
						"SELECT employee_Salary INTO salary\r\n" + 
						"FROM employee WHERE employee_id = emp_id;\r\n" + 
						"IF salary between 1000 and 10000 THEN\r\n" + 
						"SET pfAmount = salary * 0.05;\r\n" + 
						"ELSIF salary between 10000 and 100000 THEN\r\n" + 
						"SET pfAmount = salary * 0.06;\r\n" + 
						"ELSE\r\n" + 
						"SET pfAmount = salary * 0.07;\r\n" + 
						"END IF;\r\n" + 
						"END //";

				String runSP = "{ call get_employee_by_id(?)}";
				Statement statement = conn.createStatement();
				CallableStatement callableStatement = conn.prepareCall(runSP);
				statement.execute(createSP);
				callableStatement.setInt(1,id);
				callableStatement.executeUpdate();
				double pfAmount = callableStatement.getDouble(2);
				System.out.println("pF Amount: " + pfAmount);
			}
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) throws ClassNotFoundException {
		EmployeeUploader employeeUploader=new EmployeeUploader();
		//insert department values
		employeeUploader.storeDepartmentDetails(1,"Accounts","Ramesh","Accounts Dept");
		employeeUploader.storeDepartmentDetails(2,"Admin","Vijay","Admin Dept");
		employeeUploader.storeDepartmentDetails(3,"Sales","Vinod","Sales Dept");
		employeeUploader.storeDepartmentDetails(4,"HR","Mahesh","HR Dept");

		//insert employees values
		employeeUploader.storeEmployeeDetails(87,"Vikram","Address 1",12000,"987876121",2);
		employeeUploader.storeEmployeeDetails(110,"Ajay","Address 2",18000,"9654376143",1);
		employeeUploader.storeEmployeeDetails(98,"Rajesh","Address 3",11000,"9965322212",4);
		employeeUploader.storeEmployeeDetails(67,"Ram","Address 4",19000,"8078343732",3);
		employeeUploader.storeEmployeeDetails(45,"Vimal","Address 5",27000,"9932113221",4);
		employeeUploader.storeEmployeeDetails(987,"Kiran","Address 6",21000,"7076337238",2);

		//get Employee details
		employeeUploader.retrieveEmployeeDetails(87);

		//get employee PF
		employeeUploader.calculatePF(87);

		//exception scenarios
		employeeUploader.storeEmployeeDetails(9807,"Kiran","Address 6",500,"7076337238",2);
		employeeUploader.storeDepartmentDetails(4,"HR","Mahesh","HR Dept");
		employeeUploader.storeEmployeeDetails(45,"Vimal","Address 5",27000,"9932113221",4);
	}
}
