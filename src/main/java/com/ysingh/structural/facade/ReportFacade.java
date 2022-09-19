package com.ysingh.structural.facade;

import com.ysingh.structural.facade.interfaces.ExcelReport;
import com.ysingh.structural.facade.interfaces.HtmlReport;
import com.ysingh.structural.facade.interfaces.PdfReport;
import com.ysingh.structural.facade.interfaces.impl.ExcelReportImpl;
import com.ysingh.structural.facade.interfaces.impl.HtmlReportImpl;
import com.ysingh.structural.facade.interfaces.impl.PdfReportImpl;

public class ReportFacade {
	
	private PdfReport pdfReport;
	private HtmlReport htmlReport;
	private ExcelReport excelReport;
	
	public ReportFacade() {
		this.pdfReport = new PdfReportImpl();
		this.htmlReport = new HtmlReportImpl();
		this.excelReport = new ExcelReportImpl();
	}
	
	public void generatePdfReport(String connection, String tableName) {
		pdfReport.generatePdfReport(connection, tableName);
	}
	
	public void generateHtmlReport(String connection, String tableName) {
		htmlReport.generateHtmlReport(connection, tableName);
	}
	
	public void generateExcelReport(String connection, String tableName) {
		excelReport.generateExcelReport(connection, tableName);
	}

}
