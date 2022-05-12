package com.HrmProject.utility;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro ;
	public ConfigDataProvider() throws Exception {
		String path=System.getProperty("user.dir")+"\\Config\\Config.Properties";
		File src= new File(path);
		FileInputStream file= new FileInputStream(src);	
		pro = new Properties();
		pro.load(file); // load method of properties use to read properties file baised key and value
	}
	public String getBrowser() {
		return pro.getProperty("Browsername");
	}
	public String getUrl() {
		return pro.getProperty("StageUrl");
		
	}

}
