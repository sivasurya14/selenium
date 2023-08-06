package com.insurance.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {

		File src = new File("./Configurations/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);

			pro = new Properties();
			pro.load(fis);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}
	
	public String getApplicationURL () {
		
		String url = pro.getProperty("baseURL");
		return url;
		
	}
	public String getEmail () {
		
		String email = pro.getProperty("username");
		return email;
		
	}
	public String getPassword () {
		
		String pwd=pro.getProperty("password");
		return pwd;
		
	}
    public String getEdgePath () {
		
		String edpath=pro.getProperty("edgepath");
		return edpath;
}
}
