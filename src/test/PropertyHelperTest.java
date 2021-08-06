package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.rmgs.property.OS_TYPE;
import com.rmgs.property.PropertyHelper;

public class PropertyHelperTest {
	
	@Test
	public void testGetBasePath() {
		try {
			String path = PropertyHelper.getBasePath();
			System.out.println("PropertyHelper.getBasePath() returns [" + path + "]");
			assertTrue(path.length() >0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetOSPath() {
		String osName = PropertyHelper.getOSName();
		System.out.println("PropertyHelper.getOSName() returns [" + osName + "]");
		assertTrue(osName.length() >0);
	}

	@Test
	public void testGetOSType() {
		assertEquals(OS_TYPE.WINDOWS, PropertyHelper.getOSType());
		System.out.println("PropertyHelper.getOSType() returns [" + PropertyHelper.getOSType() + "]");
	}
	

	@Test
	public void testGetUserHome() {
		assertTrue(PropertyHelper.getUserHome().length() > 0);
		System.out.println("PropertyHelper.getUserHome() returns [" + PropertyHelper.getUserHome() + "]");
	}
}
