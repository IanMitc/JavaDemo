package com.thevarungupta;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
	// write your code here
        Employee employee  =new Employee();
        employee.setName("Jogn");
        employee.setEmail("j@gmail.com");

        //Employee Dao
        EmployeeDao dao = EmployeeDaoFactory.getEmployeeDao();
        dao.addEmployee(employee);
    }
}
