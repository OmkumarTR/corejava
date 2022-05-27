package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.pojo.Appointment;

/**
 * Servlet implementation class Appointments
 */
public class Appointments extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Appointments() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
        List<Appointment> applist =AppointmentDao.getAllAppointments();
		Iterator<Appointment> appItr=applist.iterator();
		
		out.println("GET ALL APPOINTMENT DETAILS");
		
		if(request.getParameter("input").equals("yes")) {
			response.setContentType("text/html");
			out.print("<html><head><title><Appointments</title></head><body>");
			out.print("<table border=1px bgcolor=\"DodgerBlue\" width=50%>");
			out.print( "<tr bgcolor=\"DarkSlateBlue\" align=center>");
			out.print("<th height=\"10\" width=\"90\">App_id:</th>");
			out.print("<th height=\"10\" width=\"90\">Doc_id:</th>");
			out.print("<th height=\"10\" width=\"90\">Patient_name:</th>");
			out.print("<th height=\"10\" width=\"90\">Fees_collected:</th>");
			out.print("<th height=\"10\" width=\"90\">Fees_catagery:</th>");
		while(appItr.hasNext()) {
			out.print("<tr align=center>");
			Appointment app=appItr.next();
			out.print("<td bgcolor=\"DeepSkyBlue\">"+app.getApp_id()+"</td>");
			out.print("<td bgcolor=\"DeepSkyBlue\">"+app.getDoc_id()+"</td>");
			out.print("<td bgcolor=\"DeepSkyBlue\">"+app.getPatient_name()+"</td>");
			out.print("<td bgcolor=\"DeepSkyBlue\">"+app.getFees_collected()+"</td>");
			out.print("<td bgcolor=\"DeepSkyBlue\">"+app.getFees_catagery()+"</td>");
			out.print("</tr>");			
		}}
		else 
			out.println(" <br><h3>thank you for processing with us</h3>");
		out.print("</body></html>");
	}
	
//-----------------------------------------------------------------------------------------------------------------------------------	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("change").equals("Add")) {
		PrintWriter out=response.getWriter();
		Appointment app = new Appointment();
		String app_id = request.getParameter("id");
		try {
			Validator.checkStringForParse(app_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			
		}
		int id=Integer.parseInt(app_id);
		try {
			Validator.CheckNumberForGreaterThanZero(id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}

		app.setApp_id(id);
		
		SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
		String app_date = request.getParameter("appdate");
		try {
			Validator.checkDate(app_date);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		try {
			app.setApp_date(appFormate.parse(app_date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String doc_Id = request.getParameter("docid");
		try {
			Validator.checkStringForParse(doc_Id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		int doctor_id=Integer.parseInt(doc_Id);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setDoc_id(doctor_id);
		
		String patient = request.getParameter("name");
		try {
			Validator.checkStringOnly(patient);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setPatient_name(patient);
		String fees_collected = request.getParameter("fees");
		try {
			Validator.checkStringForParse(fees_collected);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		float fees=Integer.parseInt(fees_collected);
		
		try {
			Validator.CheckNumberForGreaterThanZero(fees);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setFees_collected(fees);
		String fees_cat = request.getParameter("feesCat");
		try {
			Validator.checkStringOnly(fees_cat);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setFees_catagery(fees_cat);
		int result = AppointmentDao.insertAppointments(app);
		out.println("INSERT NEW APPOINTMENT DETAILS status :"+result + "row inserted");
		try {
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		}else if(request.getParameter("change").equals("update")) {
			doPut(request,response);
		}else if(request.getParameter("change").equals("Delete")) {
			doDelete(request,response);
		}
		
	}
	
	
	
//------------------------------------------------------------------------------------------------------------------------------------	
	

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Appointment app = new Appointment();
		String app_id = request.getParameter("id");
		try {
			Validator.checkStringForParse(app_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
			
		}
		int id=Integer.parseInt(app_id);
		try {
			Validator.CheckNumberForGreaterThanZero(id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}

		app.setApp_id(id);
		
		SimpleDateFormat appFormate = new SimpleDateFormat("dd/MM/yyyy");
		String app_date = request.getParameter("appdate");
		try {
			Validator.checkDate(app_date);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		try {
			app.setApp_date(appFormate.parse(app_date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String doc_Id = request.getParameter("docid");
		try {
			Validator.checkStringForParse(doc_Id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		int doctor_id=Integer.parseInt(doc_Id);
		try {
			Validator.CheckNumberForGreaterThanZero(doctor_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setDoc_id(doctor_id);
		
		String patient = request.getParameter("name");
		try {
			Validator.checkStringOnly(patient);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setPatient_name(patient);
		String fees_collected = request.getParameter("fees");
		try {
			Validator.checkStringForParse(fees_collected);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		float fees=Integer.parseInt(fees_collected);
		
		try {
			Validator.CheckNumberForGreaterThanZero(fees);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setFees_collected(fees);
		String fees_cat = request.getParameter("feesCat");
		try {
			Validator.checkStringOnly(fees_cat);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		app.setFees_catagery(fees_cat);
		int result = AppointmentDao.updateAppointments(app);
		out.println("Update Status :"+result + "row Updated");
		try {
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	
//--------------------------------------------------------------------------------------------------------------------------------------------	
	
	
	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String app_id=request.getParameter("id");
		try {
			Validator.checkStringForParse(app_id);
		}catch(InvalidInputDataException e) {
			e.printStackTrace();
		}
		int id=Integer.parseInt(app_id);
		int result = AppointmentDao.deleteAppointments(id);
		out.println("Delete Status : "+result+"row deleted");
		try {
			out.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
