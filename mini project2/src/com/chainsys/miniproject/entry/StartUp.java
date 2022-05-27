package com.chainsys.miniproject.entry;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.ui.AppointmentUI;
import com.chainsys.miniproject.ui.DoctorUI;
import com.chainsys.miniproject.ui.EmployeeUI;

public class StartUp {
	public static void main(String[] args) {
		loadAppointmentMenu();
	}
	
	private static void loadEmployeeMenu() throws InvalidInputDataException {
        System.out.println(
                "Enter Employee Method :"
                + " 1=addEmployee,"
                + " 2=UpdateEmployee ,"
                + "3=deleteEmployee ,"
                + "4=updateFirstnameOfEmployee, "
                + "5=updateSalaryOfEmployee, "
                + "6=fetchEmployeeById, 7=fetchAllEmployee");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        try {
        int call = sc.nextInt();
        
        switch (call) {
        case 1:
            EmployeeUI.addNewEmployee();
            break;

        case 2:
        	EmployeeUI.UpdateEmployee();
            break;
        case 3:
        	EmployeeUI.deleteEmployee();
            break;
        case 4:
        	EmployeeUI.updateFirstnameOfEmployee();
            break;
        case 5:
        	EmployeeUI.updateSalaryOfEmployee();
            break;
        case 6:
        	EmployeeUI.fetchEmployeeById();
            break;
        case 7:
        	EmployeeUI.fetchAllEmployee();
        }
        }finally {
            sc.close();
        }
    }
	private static void loadDoctorMenu() {
		System.out.println(
				"Enter Doctor Method : 1=addNewDoctor ,"
				+ "2=deleteDoctordetails ,"
				+ "3=updateDoctorDetails ,"
				+ "4=ViewAllDoctorDetails, "
				+ "5=viewDoctorDetailsById, ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				DoctorUI.addNewDoctor();
				break;
			case 2:
				DoctorUI.deleteDoctordetails();
				break;
			case 3:
				DoctorUI.updateDoctorDetails();
				break;
			case 4:
				DoctorUI.ViewAllDoctorDetails();
				break;
			case 5:
				DoctorUI.viewDoctorDetailsById();
				break;
			}
		} finally {
			sc.close();
		}
	}

	private static void loadAppointmentMenu() {
		System.out.println(
				"Enter Method : 1=addNewAppointment ,"
				+ "2=updateAppointment ,"
				+ "3=allAppointment ,"
				+ "4=viewAppointment ,5=deleteAppointment ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				AppointmentUI.addNewAppointments();
				break;

			case 2:
				AppointmentUI.updateAppointmentDetails();
				break;
			case 3:
				AppointmentUI.allAppointmentDetails();
				break;
			case 4:
				AppointmentUI.viewAppointmentDetails();
				break;
			case 5:
				AppointmentUI.deleteAppointmentDetails();
				break;

			}
		} finally {
			sc.close();
		}
	}

}


