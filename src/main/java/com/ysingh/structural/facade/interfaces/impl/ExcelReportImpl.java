package com.ysingh.structural.facade.interfaces.impl;

import com.ysingh.structural.facade.interfaces.ExcelReport;

public class ExcelReportImpl implements ExcelReport {

	@Override
	public void generateExcelReport(String connection, String tableName) {
		System.out.println("EXCEL report generation logic is here!!!!!");
	}

}
