package com.ysingh.structural.facade.interfaces.impl;

import com.ysingh.structural.facade.interfaces.PdfReport;

public class PdfReportImpl implements PdfReport {

	@Override
	public void generatePdfReport(String connection, String tableName) {
		System.out.println("PDF report generation logic is here!!!!!");
	}

}
