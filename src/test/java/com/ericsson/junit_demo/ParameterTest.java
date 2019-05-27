/**
 * <p>Title: ParameterTest.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: Ericsson</p>
 * @author dengjili
 * @date 2019年5月26日
 * @version 1.0
 */
package com.ericsson.junit_demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * <p>Title: ParameterTest</p>
 * <p>Description: </p>
 * <p>Company: Ericsson</p> 
 * @author    dengjili
 * @date      2019年5月26日 下午11:53:52
 */

@RunWith(Parameterized.class)
public class ParameterTest {
	private static String zipRegEx = "^\\d{5}([\\-]\\d{4})?$";
	private static Pattern pattern;
	
	private String phrase;
	private boolean match;
	
	public ParameterTest(String phrase, boolean match) {
		this.phrase = phrase;
		this.match = match;
	}

	@Before
	public void setUpBefore() throws Exception {
		pattern = Pattern.compile(zipRegEx);
	}
	
	@Test
	public void verifyGoodZipCode() throws Exception {
		Matcher mtcher = this.pattern.matcher(phrase);
		boolean isValid = mtcher.matches();
		Assert.assertEquals("Pattern did not validate zip code", isValid, match);
	}
	
	@Parameters
	public static Collection regExValues() {
		return Arrays.asList(new Object[][] { { "22101", true }, { "221x1", false }, { "22101-5150", true },
			{ "221015150", false } , { "221015150", false } });
	}
}
