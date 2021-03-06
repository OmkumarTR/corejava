package com.chainsys.miniproject.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;

public class EmployeeUI {
	
	public static void main(String args[])
	{
		UpdateEmployee();
	}
	public static void addNewEmployee() {
		Scanner sc = new Scanner(System.in);
		Employee newemp = null;
		int result = 0;
		int empId = 0;
		try {
			newemp = new Employee();
			
			System.out.println("Enter Employee Id: ");
			String id = sc.nextLine();
			// TODO - validate input String
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			empId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
            newemp.setEmpId(empId);
//--------------------------------
			System.out.println("Enter Employee FirstName: ");
			String fname = sc.nextLine();
			try {
				Validator.checkStringOnly(fname);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			try {
				Validator.checklengthOfString(fname);
			}catch(InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setFirst_name(fname);
//-----------------------------------
			System.out.println("Enter Employee lastName: ");
			String lname = sc.nextLine();
			try {
				Validator.checkStringOnly(fname);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			try {
				Validator.checklengthOfString(lname);
			}catch(InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setLast_name(lname);
//----------------------------------			
			System.out.println("Enter Employee Email: ");
			String email = sc.nextLine();
			try {
				Validator.checkMail(email);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			newemp.setEmail(email);
//--------------------------------------			
			System.out.println("Enter Employee hire_date like \"dd/mm/yyyy\":");
			SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String emp_HireDate = sc.nextLine();
			// Date hire_date=hire_dateFormate.parse(emp_HireDate);
			
			try {
				Validator.checkDateFormat(emp_HireDate);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			Date newDate = null;
			try {
				newDate = hire_dateFormate.parse(emp_HireDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			newemp.setHireDate(newDate);
//----------------------------------------
			System.out.println("Enter Employee JobId: ");
			String jobId = sc.nextLine();
			try {
				Validator.checkjob(jobId);
			}catch(InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setJobId(jobId);
//---------------------------------------			
			System.out.println("Enter Employee Salary: ");
			String sal = sc.nextLine();
			try {
				Validator.checkStringForParse(sal);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
		Float salParse =Float.parseFloat(sal);
			try {
			Validator.checkSalLimit(salParse);
			}catch(InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setSalary(salParse);
//----------------------------------------------			
			result = EmployeeDao.insertEmployee(newemp);
			System.out.println(result + " Added Successfully");
		} finally {
			sc.close();
		}
	}

	public static void UpdateEmployee() {
		Scanner sc = new Scanner(System.in);
		Employee newemp = new Employee();
		int result = 0;
		try {

			System.out.println("Enter Employee Id: ");
			String id = sc.nextLine();
			// TODO - validate input String
			try {
				Validator.checkStringForParse(id);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			int empId = Integer.parseInt(id);
			try {
				Validator.CheckNumberForGreaterThanZero(empId);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
            newemp.setEmpId(empId);
//--------------------------------
			System.out.println("Enter Employee FirstName: ");
			String fname = sc.nextLine();
			try {
				Validator.checkStringOnly(fname);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			try {
				Validator.checklengthOfString(fname);
			}catch(InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setFirst_name(fname);
//-----------------------------------
			System.out.println("Enter Employee lastName: ");
			String lname = sc.nextLine();
			try {
				Validator.checkStringOnly(fname);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			try {
				Validator.checklengthOfString(lname);
			}catch(InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setLast_name(lname);
//----------------------------------			
			System.out.println("Enter Employee Email: ");
			String email = sc.nextLine();
			try {
				Validator.checkMail(email);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
				return;
			}
			newemp.setEmail(email);
//--------------------------------------			
			System.out.println("Enter Employee hire_date like \"dd/mm/yyyy\":");
			SimpleDateFormat hire_dateFormate = new SimpleDateFormat("dd/MM/yyyy");
			String emp_HireDate = sc.nextLine();
			// Date hire_date=hire_dateFormate.parse(emp_HireDate);
			
			try {
				Validator.checkDateFormat(emp_HireDate);
			} catch (InvalidInputDataException e) {
				e.printStackTrace();
			}
			Date newDate = null;
			try {
				newDate = hire_dateFormate.parse(emp_HireDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			newemp.setHireDate(newDate);
//----------------------------------------
			System.out.println("Enter Employee JobId: ");
			String jobId = sc.nextLine();
			try {
				Validator.checkjob(jobId);
			}catch(InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setJobId(jobId);
//---------------------------------------			
			System.out.println("Enter Employee Salary: ");
			String sal = sc.nextLine();
			try {
				Validator.checkStringForParse(sal);
			} catch (InvalidInputDataException err) {
				err.printStackTrace();
			}
			float salParse =Float.parseFloat(sal);
			try {
			Validator.checkSalLimit(salParse);
			}catch(InvalidInputDataException err) {
				err.printStackTrace();
			}
			newemp.setSalary(salParse);
//----------------------------------------------	
			result = EmployeeDao.updateEmployee(newemp);
			System.out.println(result + " Updated Successfully");

		} finally {
			sc.close();
		}
	}

	public static void updateFirstnameOfEmployee() {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		String id = null;
		String fname = null;
		System.out.println("Enter Employee Id: ");
	    id = sc.nextLine();
		// TODO - validate input String
		try {
			Validator.checkStringForParse(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		int empId = Integer.parseInt(id);
		try {
			Validator.CheckNumberForGreaterThanZero(empId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		Employee emp = EmployeeDao.getEmployeeById(empId);
		emp.setEmpId(empId);
		System.out.println("Enter Employee FirstName: ");
	    fname = sc.nextLine();
		try {
			Validator.checkStringOnly(fname);
		} catch (InvalidInputDataException e) {
			e.printStackTrace();
			return;
		}
		try {
			Validator.checklengthOfString(fname);
		}catch(InvalidInputDataException err) {
			err.printStackTrace();
		}
		sc.close();
		result = EmployeeDao.updateEmployeeFirstName(empId, fname);
		System.out.println(result + " updated Successfully");
	}

	public static void updateSalaryOfEmployee() {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		String id = null;
		String salary = null;
		System.out.println("Enter Employee Id: ");
		id = sc.nextLine();
		try {
			Validator.checkStringForParse(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		int empId = Integer.parseInt(id);
		try {
			Validator.CheckNumberForGreaterThanZero(empId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		System.out.println("Enter Salary: ");
		salary = sc.nextLine();
		try {
			Validator.checkStringForParse(salary);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		long salParse = (long) Float.parseFloat(salary);
		try {
		Validator.checkSalLimit(salParse);
		}catch(InvalidInputDataException err) {
			err.printStackTrace();
		}
		sc.close();
		result = EmployeeDao.updateEmployeeSalary(empId, salParse);
		System.out.println(result + " updated Successfully");
	}

	public static void deleteEmployee() {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		String id = null;
		System.out.println("Enter Employee Id: ");
		id = sc.nextLine();
		try {
			Validator.checkStringForParse(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		int empId = Integer.parseInt(id);
		try {
			Validator.CheckNumberForGreaterThanZero(empId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		sc.close();
		result = EmployeeDao.deleteEmployee(empId);
		System.out.println(result + " Deleted Successfully");
	}

	public static void fetchEmployeeById() {
		Scanner sc = new Scanner(System.in);
		Employee result = new Employee();
		String id1 = null;
		System.out.println("Enter Employee Id: ");
		String id = sc.nextLine();
		try {
			Validator.checkStringForParse(id);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}
		int empId = Integer.parseInt(id);
		try {
			Validator.CheckNumberForGreaterThanZero(empId);
		} catch (InvalidInputDataException err) {
			err.printStackTrace();
		}

		result = EmployeeDao.getEmployeeById(empId);
		System.out.println("Employee id: " + result.getEmpId() + "\n" + "Employee first name: "
				+ result.getFirst_name() + "\n" + "Employee last name: " + result.getLast_name() + "\n"
				+ "Employee email: " + result.getEmail() + "\n" + "Employee hiredate: " + result.getHireDate() + "\n"
				+ "Employee job id: " + result.getJobId() + "\n" + "Employee salary: " + result.getSalary() + "\n");
		sc.close();
	}// EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,HIRE_DATE,JOB_ID,SALARY

	public static void fetchAllEmployee() {
		List<Employee> allEmployees = EmployeeDao.getAllEmployee();
		Iterator<Employee> empIterator = allEmployees.iterator();
		while (empIterator.hasNext()) {
			Employee result = empIterator.next();
			System.out.println("Employee id: " + "\t" + "Employee first name: " + "\t" + "Employee last name: " + "\t"
					+ "Employee email: " + "\t" + "Employee hiredate: " + "\t" + "Employee job id: " + "\t"
					+ "Employee salary: " + "\t");
			System.out.println(
					"---------------------------------------------------------------------------------------------------");
			System.out.println(result.getEmpId() + "\t" + result.getFirst_name() + "\t" + result.getLast_name() + "\t"
					+ result.getEmail() + "\t" + result.getHireDate() + "\t" + result.getJobId() + "\t"
					+ result.getSalary());
		}
	}

}


