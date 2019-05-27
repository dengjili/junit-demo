/**
 * <p>Title: TimeoutTest.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: Ericsson</p>
 * @author dengjili
 * @date 2019年5月26日
 * @version 1.0
 */
package com.ericsson.junit_demo;

import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * <p>Title: TimeoutTest</p>
 * <p>Description: </p>
 * <p>Company: Ericsson</p> 
 * @author    dengjili
 * @date      2019年5月26日 下午11:43:48
 */
public class IgnoreTest {
	@Ignore  // 忽略、不再有效
	@Test
	public void verifyTrue() throws Exception {
		Assert.assertTrue(false);
	}
}
