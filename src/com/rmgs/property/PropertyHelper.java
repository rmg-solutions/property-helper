package com.rmgs.property;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class PropertyHelper {
	
	private static Properties _props = new Properties();
	
	public static String getBasePath() throws IOException {
		return new File(".").getCanonicalPath();
	}
	
	public static String getOSName() {
		return System.getProperty("os.name");
	}
	
	public static OS_TYPE getOSType() {
		String osName = getOSName().toLowerCase();
		if(osName.contains("win")) {
			return OS_TYPE.WINDOWS;
		} else if(osName.contains("mac")) {
			return OS_TYPE.MAC;
		} else if(osName.contains("nix") || osName.contains("nux") || osName.contains("aix")) {
			return OS_TYPE.UNIX;
		} else if(osName.contains("sunos")) {
			return OS_TYPE.SOLARIS;
		}
		return null;
	}
	
	public static String getUserHome() {
		return System.getProperty("user.home");
	}
	
	public static String put(String key, Object object) {
		_props.put(key, object);
		return _props.getProperty(key);		
	}
	
	public static String getString(String key, String defaultValue) {
		return _props.getProperty(key, defaultValue);		
	}

	public static Boolean getBoolean(String key, Boolean defaultValue) {
		return Boolean.parseBoolean(_props.getProperty(key, defaultValue.toString()));		
	}

	public static Integer getInteger(String key, Integer defaultValue) {
		return Integer.parseInt(_props.getProperty(key, defaultValue.toString()));		
	}

	public static Double getDouble(String key, Double defaultValue) {
		return Double.parseDouble(_props.getProperty(key, defaultValue.toString()));		
	}
}
