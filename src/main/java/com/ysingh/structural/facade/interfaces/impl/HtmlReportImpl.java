package com.ysingh.structural.facade.interfaces.impl;

import com.ysingh.structural.facade.interfaces.HtmlReport;

public class HtmlReportImpl implements HtmlReport {

	@Override
	public void generateHtmlReport(String connection, String tableName) {
		System.out.println("HTML report generation logic is here!!!!!");		
	}

}
