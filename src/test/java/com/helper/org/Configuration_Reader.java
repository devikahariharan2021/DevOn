package com.helper.org;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p = new Properties();

	public Configuration_Reader() throws Throwable {
		File f = new File(
				"F:\\Java\\DevikaHariharan_6th_May_2021\\src\\test\\java\\com\\sauce\\properties\\configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p.load(fis);
	}

	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}

	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
}
