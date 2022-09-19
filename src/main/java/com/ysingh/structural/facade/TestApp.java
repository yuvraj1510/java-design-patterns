package com.ysingh.structural.facade;

import com.ysingh.structural.facade.interfaces.ExcelReport;
import com.ysingh.structural.facade.interfaces.HtmlReport;
import com.ysingh.structural.facade.interfaces.PdfReport;
import com.ysingh.structural.facade.interfaces.impl.ExcelReportImpl;
import com.ysingh.structural.facade.interfaces.impl.HtmlReportImpl;
import com.ysingh.structural.facade.interfaces.impl.PdfReportImpl;

public class TestApp {

	public static void main(String[] args) {
		String connection = null;
		String tableName = "employee";
		
		PdfReport pdfReport = new PdfReportImpl();
		pdfReport.generatePdfReport(connection, tableName);
		
		HtmlReport htmlReport = new HtmlReportImpl();
		htmlReport.generateHtmlReport(connection, tableName);
		
		ExcelReport excelReport = new ExcelReportImpl();
		excelReport.generateExcelReport(connection, tableName);
		
		System.out.println("-------------USING FACADE PATTERN------------");
		
		ReportFacade reportFacade = new ReportFacade();
		reportFacade.generatePdfReport(connection, tableName);
		reportFacade.generateHtmlReport(connection, tableName);
		reportFacade.generateExcelReport(connection, tableName);
		

	}

}
