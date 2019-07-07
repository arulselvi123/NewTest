package com.helper;

public class FileReaderManager {
private FileReaderManager() {
}
public static FileReaderManager fm = new FileReaderManager();
public static FileReaderManager getInstance() {
	return fm;
}
public ConfigReader cr;
public ConfigReader getCr() throws Throwable { 
	if(cr==null) {
		cr = new ConfigReader();
	}
	return cr;
}
	
}
