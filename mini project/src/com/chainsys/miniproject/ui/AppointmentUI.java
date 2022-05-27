package com.chainsys.miniproject.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.pojo.Appointment;

public class AppointmentUI {

	public static void addNewAppointments() {
		Scanner sc = new Scanner(System.in);
		Appointment app = new Appointment();
		
		System.out.println("Enter the Appointment id:");
		String app_id = sc.nextLine();
		try {
			Validator.checkStringForParse(app_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
			
		}
		int id=Integer.parseInt(app_id);
		try {
			Validator.CheckNumberForGreaterThanZero(id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}

		app.setApp_id(id);
		
		System.out.println("Enter Appointment Date like \"dd/mm/yyyy\":");
		SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
		String app_date = sc.nextLine();
		try {
			app.setApp_date(appFormate.parse(app_date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			Validator.checkDate(app_date);
		}
		catch(InvalidInputDataException e)
		{
			e.printStackTrace();
		}
		System.out.println("Enter Doctor id:");
		String doc_Id = sc.nextLine();
		try {
			Validator.checkStringForParse(doc_Id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int doctor_id=Integer.parseInt(doc_Id);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setDoc_id(doctor_id);
		
		System.out.println("Enter patient Name:");
		String patient = sc.nextLine();
		try {
			Validator.checkStringOnly(patient);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setPatient_name(patient);
		System.out.println("Enter fees collected:");
		String fees_collected = sc.nextLine();
		try {
			Validator.checkStringForParse(fees_collected);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int fees=Integer.parseInt(fees_collected);
		
		try {
			Validator.CheckNumberForGreaterThanZero(fees);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setFees_collected(fees);
		System.out.println("Enter fees catagery:");
		String fees_cat = sc.nextLine();
		try {
			Validator.checkStringOnly(fees_cat);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setFees_catagery(fees_cat);
		int result = AppointmentDao.insertAppointments(app);
		System.out.println(result + "row inserted");
		sc.close();
	}
	public static void viewAppointmentDetailsById() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Appointment id:");
		int app_id = sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(app_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		Appointment doc = AppointmentDao.getAppointmentsById(app_id);
		System.out.println("Appointment id:" + doc.getApp_id());
		System.out.println("Appointment date:" + doc.getApp_date());
		System.out.println("Patient Name :"+doc.getPatient_name());
		System.out.println("Doctor id:" + doc.getDoc_id());
		System.out.println("fees collected:" + doc.getFees_collected());
		System.out.println("fees catagery:" + doc.getFees_catagery());
		sc.close();
	}
	public static void ViewAllAppointmentDetails() {
		List<Appointment> applist =AppointmentDao.getAllAppointments();
		Iterator<Appointment> appItr=applist.iterator();
		while(appItr.hasNext()) {
			Appointment app=appItr.next();
			System.out.println("app id:"+app.getApp_id()+"		"+app.getPatient_name()+"		"+app.getDoc_id()+"  "
					+ "		"+app.getFees_collected()+"     "+app.getFees_catagery());
		}
	}
	public static void updateAppDetails() {
		Scanner sc = new Scanner(System.in);
		Appointment app = new Appointment();
		
		System.out.println("Enter the Appointment id:");
		String app_id = sc.nextLine();
		try {
			Validator.checkStringForParse(app_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int id=Integer.parseInt(app_id);
		try {
			Validator.CheckNumberForGreaterThanZero(id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setApp_id(id);
		
		System.out.println("Enter Appointment Date like \"dd/mm/yyyy\":");
		SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
		String app_date = sc.nextLine();
		try {
			app.setApp_date(appFormate.parse(app_date));
		} catch (ParseException e) {
			e.printStackTrace();
			System.exit(-1); 
		}
		System.out.println("Enter Doctor id:");
		String doc_name = sc.nextLine();
		try {
			Validator.checkStringForParse(doc_name);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int doctor_id=Integer.parseInt(doc_name);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setDoc_id(doctor_id);
		
		System.out.println("Enter patient Name:");
		String patient = sc.nextLine();
		try {
			Validator.checkStringOnly(patient);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setPatient_name(patient);
		System.out.println("Enter fees collected:");
		String fees_collected = sc.nextLine();
		try {
			Validator.checkStringForParse(fees_collected);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int fees=Integer.parseInt(fees_collected);
		try {
			Validator.CheckNumberForGreaterThanZero(fees);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setFees_collected(fees);
		System.out.println("Enter fees catagery:");
		String fees_cat = sc.nextLine();
		try {
			Validator.checkStringOnly(fees_cat);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		app.setFees_catagery(fees_cat);
		int result = AppointmentDao.updateAppointments(app);
		System.out.println(result + "row updated");
		sc.close();
		}
	public static void deleteAppointmentDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Appointment id:");
		int app_id=sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(app_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int result = AppointmentDao.deleteAppointments(app_id);
		System.out.println(result+"row deleted");
		sc.close();
	}
	public static void updatePatientName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter patient Name:");
		String patient=sc.nextLine();
		try {
			Validator.checkStringOnly(patient);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println("Enter Appointment id:");
		int app_id=sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(app_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int result=AppointmentDao.updatePatientName(app_id,patient);
		System.out.println(result+" row updated");
		sc.close();
		
	}
	public static void updateCollectedfees() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter collected fees:");
		int colleted_fees=sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(colleted_fees);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		System.out.println("Enter Appointment id:");
		int app_id=sc.nextInt();
		try {
			Validator.CheckNumberForGreaterThanZero(app_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		int result=AppointmentDao.updateCollectedFees(app_id, colleted_fees);
		System.out.println(result+" row updated");
		sc.close();
	}
	
}
