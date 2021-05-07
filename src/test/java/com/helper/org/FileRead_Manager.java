package com.helper.org;

public class FileRead_Manager {

	public static FileRead_Manager getInstance() {
		FileRead_Manager helper = new FileRead_Manager();
		return helper;
	}

	public Configuration_Reader getInstanceCR() throws Throwable {
		Configuration_Reader reader = new Configuration_Reader();
		return reader;
	}

}
