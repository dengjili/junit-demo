/**
 * <p>Title: FirstTest.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: Ericsson</p>
 * @author dengjili
 * @date 2019年5月26日
 * @version 1.0
 */
package com.ericsson.junit_demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * <p>Title: FirstTest</p>
 * <p>Description: </p>
 * <p>Company: Ericsson</p> 
 * @author    dengjili
 * @date      2019年5月26日 下午11:29:38
 */
public class NormalTest {
	private static String zipRegEx = "^\\d{5}([\\-]\\d{4})?$";
	private static Pattern pattern;

	@Before
	public void setUpBefore() throws Exception {
		pattern = Pattern.compile(zipRegEx);
	}

	@Test
	public void verifyGoodZipCode() throws Exception {
		Matcher mtcher = this.pattern.matcher("22101");
		boolean isValid = mtcher.matches();
		Assert.assertTrue("Pattern did not validate zip code", isValid);
	}
	
	@After
	public void setUpAfter() throws Exception {
		System.out.println("执行结束");
	}
 
}
